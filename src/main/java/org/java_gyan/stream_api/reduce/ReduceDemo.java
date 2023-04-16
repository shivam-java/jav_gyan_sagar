package org.java_gyan.stream_api.reduce;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReduceDemo {

    public static void main(String[] args) {
        List<Integer> collect = IntStream.range(1, 5).boxed().collect(Collectors.toList());
        int sum = collect.stream().mapToInt(a -> a).sum();
        System.out.println(sum);
        /*
        Reduce method
         */
        Integer reduce = collect.stream().reduce(3,(a, b) -> a + b);
        System.out.println(reduce);
    }
}
