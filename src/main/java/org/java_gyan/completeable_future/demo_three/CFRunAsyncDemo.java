package org.java_gyan.completeable_future.demo_three;

import java.util.concurrent.*;

public class CFRunAsyncDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(
                () ->
                {
                    System.out.println("Hello I am CF Asynchronous "+"printed by "+Thread.currentThread().getName());
                }
        );
        System.out.println(completableFuture.isDone()+"   printed by "+Thread.currentThread().getName());


        ExecutorService executorService= Executors.newFixedThreadPool(100);
        CompletableFuture<Void> completableFutureWithExecutor= CompletableFuture.runAsync(
                () ->
                {
                    System.out.println("Hello I am CF Asynchronous " + "printed by " + Thread.currentThread().getName());
                }, executorService
        );
        System.out.println(completableFutureWithExecutor.isDone()+"   printed by "+Thread.currentThread().getName());
    }
}
