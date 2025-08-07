package com.example.java8Practices;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingExampleByLength {

    public static void main(String[] args) {

        List<String> languages = Arrays.asList("Java", "Python", "C", "Kotlin","C++");
        languages.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

    }
}
