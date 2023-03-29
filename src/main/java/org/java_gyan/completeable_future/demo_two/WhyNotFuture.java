package org.java_gyan.completeable_future.demo_two;

import java.util.concurrent.*;

public class WhyNotFuture {

/*

In this example we see that mutiple futurees cann not be chained or joined
Thats why we need CF
 */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newCachedThreadPool();
       Future<String> future1=executorService.submit(
               ()->{
              return "first future";
               }
       );

        Future<String> future2=executorService.submit(
                ()->{
                    return "second future";
                }
        );

        Future<String> future3=executorService.submit(
                ()->{
                    return "third future";
                }
        );

        String s = future1.get();
        System.out.println(s);
    }
}
