package com.example.java8Practices;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharacterOccurenceInString {

    //Characters Occurence in String

    public static void main(String[] args) {
        String str = "abcaprtarsopu";
        str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);
    }
}
