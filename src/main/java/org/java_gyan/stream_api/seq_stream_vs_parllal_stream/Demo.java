package org.java_gyan.stream_api.seq_stream_vs_parllal_stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo {

    public static void main(String[] args) {

        List<Integer> collect = IntStream.range(1, 10).boxed().collect(Collectors.toList());
        long l = System.currentTimeMillis();
        collect.stream().forEach(e->System.out.println(Thread.currentThread().getName()+" stream "+e));
        long et = System.currentTimeMillis();
        System.out.println("Time Taken from Seq Stream "+(et-l));
        long st = System.currentTimeMillis();
        collect.parallelStream().forEach(e->System.out.println(Thread.currentThread().getName()+" parllalStream "+e));
        long end = System.currentTimeMillis();
        System.out.println("Time Taken from Parllal Stream "+(end-st));
    }
}
