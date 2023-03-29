package org.java_gyan.multi_threading;

public class ThreadUsingThreadClass extends Thread
{
    @Override
    public void run() {
        System.out.println("Thread Invoked"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadUsingThreadClass threadUsingThreadClass=new ThreadUsingThreadClass();
      //  threadUsingThreadClass.start();
/*
       threadUsingThreadClass.run();
       threadUsingThreadClass.run();
       threadUsingThreadClass.run();
       threadUsingThreadClass.run();
       we can call run method many times while we cant call start
 */
    }
}
