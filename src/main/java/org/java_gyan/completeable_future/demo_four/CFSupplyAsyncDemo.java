package org.java_gyan.completeable_future.demo_four;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CFSupplyAsyncDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<List<Employee>> aTrue = CompletableFuture.supplyAsync(
                () ->
                {
                    try {
                        return EmployeeService.fetchEmployees();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
        ).thenApply(
                employees ->
                {
                    return employees.stream().filter(e -> e.getNewJoiner().equals("TRUE"));
                }
        ).thenApply(e -> e.collect(Collectors.toList()));
        System.out.println(aTrue.get().size());

    }
}
