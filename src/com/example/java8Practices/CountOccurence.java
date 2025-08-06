package com.example.java8Practices;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurence {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc" , "pqr" , "mnp" , "abc" , "xyz" , "abc", "vbf");
        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().stream().forEach(System.out::println);
    }
}
