package com.example.java8Practices;

import java.util.List;

public class EvenOddNumbers {


    public static void main(String[] args) {
        List<Integer> list = List.of(1,5,2,6,8,9);
        list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
