package com.example.java8Practices;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "sdfwfasdsaSD";

        Character c = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(n -> n.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println("Non repeated character "+c);
    }
}
