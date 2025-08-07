package com.example.java8Practices;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,3,0,5,4,7,8);

        List<Integer> sortedList = list.stream().sorted().toList();
        System.out.println(sortedList);

        //Sort list with unique fields
        List<Integer> distinctSortedList = list.stream().sorted().distinct().toList();
        System.out.println(distinctSortedList);

        //Reverse order
       // list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        List<Integer> reverseOrder = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(reverseOrder);
    }
}
