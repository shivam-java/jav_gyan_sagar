package org.java_gyan.stream_api.reduce.builtinmaps;

import java.util.List;
import java.util.Optional;

public class GetLongestLenghtofStringList {


    public static void main(String[] args) {
        List<String> list = List.of("virat kohli", "rohit", "dhoni");
        Optional<String> reduce = list.stream().reduce((e1, e2) -> e1.length() > e2.length() ? e1 : e2);
        System.out.println(reduce.get());
    }
}
