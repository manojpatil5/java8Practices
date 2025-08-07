package com.example.java8Practices;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
     Predicate<Integer> isEven  = n ->  n % 2 == 0 ;

        boolean test = isEven.test(4);
        System.out.println(test);

        boolean test1 = isEven.test(3);
        System.out.println(test1);
    }
}
