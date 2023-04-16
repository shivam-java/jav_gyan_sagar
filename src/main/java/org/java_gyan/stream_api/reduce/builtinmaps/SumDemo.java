package org.java_gyan.stream_api.reduce.builtinmaps;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumDemo {

    public static void main(String[] args) {
        List<Integer> collect = IntStream.range(1, 10).boxed().collect(Collectors.toList());
        int sum = collect.stream().mapToInt(i -> i).sum();
        System.out.println(sum);
        //with reduce method
        Integer reduce = collect.stream().reduce(0,(a, b) -> a + b);
        Optional<Integer> reduce1 = collect.stream().reduce(Integer::sum);
        System.out.println(reduce);
        System.out.println(reduce1.get());

    }
}
