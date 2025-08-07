package com.example.java8Practices;

import java.util.HashSet;
import java.util.LinkedHashSet;
public class FirstRepeatedCharacter {

    public static void main(String[] args) {
        String str = "bdbsgaffhatab";

//        Map.Entry<Character, Long> characterLongEntry = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst().get();
//
//        System.out.println("key "+characterLongEntry.getKey()+" - "+characterLongEntry.getValue());

        HashSet<Character> set = new LinkedHashSet<>();

        Character c = str.chars().mapToObj(ch -> (char) ch).filter(n -> !set.add(n)).findFirst().orElse(null);

        System.out.println("First Repeated character "+c);
    }
}
