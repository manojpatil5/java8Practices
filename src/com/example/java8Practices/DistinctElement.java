package com.example.java8Practices;

import java.util.Arrays;
import java.util.List;

public class DistinctElement {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc" , "pqr" , "mnp" , "abc" , "xyz" , "abc", "vbf");
         list.stream().distinct().toList().forEach(System.out::println);
    }
}
