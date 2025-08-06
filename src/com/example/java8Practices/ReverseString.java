package com.example.java8Practices;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Manoj";

        String reverseString = new StringBuilder(str).reverse().toString();
        System.out.println(reverseString);
    }
}
