package org.java_gyan.completeable_future.demo_one;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class Demo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = calcualateAsync();
        System.out.println(completableFuture.get());
        System.out.println(Thread.currentThread().getName());
    }

    private static CompletableFuture<String> calcualateAsync()
    {
        CompletableFuture<String> completableFuture=new CompletableFuture<>();
        List<String> playersList=new ArrayList<>();
        playersList.add("virat");
        playersList.add("dhoni");
        playersList.add("raina");
        playersList.add("sachin");

        Executors.newCachedThreadPool().submit(
                ()->{
                    try {
                        Thread.sleep(100);
                        String join = String.join(",", playersList);
                        completableFuture.complete(join);
                        System.out.println(Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        );
                return completableFuture;
    }
}
