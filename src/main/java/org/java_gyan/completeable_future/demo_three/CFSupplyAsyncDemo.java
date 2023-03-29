package org.java_gyan.completeable_future.demo_three;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CFSupplyAsyncDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(
                () ->
                {
                    return "Hello I am CF Asynchronous " + "printed by " + Thread.currentThread().getName();
                }
        );
        System.out.println(completableFuture1.isDone() + "   printed by " + Thread.currentThread().getName());


        ExecutorService executorService = Executors.newFixedThreadPool(100);
        CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(
                () ->
                {
                    return "Hello I am CF Asynchronous " + "printed by " + Thread.currentThread().getName();
                }, executorService
        );

        List<CompletableFuture<String>> completableFutureList = List.of(completableFuture1, completableFuture2);
        CompletableFuture<Void> completableFuture = CompletableFuture.allOf(completableFutureList.toArray(new CompletableFuture[completableFutureList.size()]));
        CompletableFuture<List<String>> listCompletableFuture = completableFuture.thenApply(c -> completableFutureList.stream().map(CompletableFuture::join).collect(Collectors.toList()));
        System.out.println(listCompletableFuture.get());
    }
}
