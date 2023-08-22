package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class streamApiQuestion {

    public static void main(String[] args) {

        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10}; // Given a list of integers, filter out the even numbers and return the sum of the remaining numbers.

        int sum = Arrays.stream(numbers)
                .filter(n -> n%2 !=0)
                .mapToInt(n -> n)
                .sum();

        System.out.println("Sum of odd number: "+sum);


        List<String> words = Arrays.asList("apple","banana","orange","date"); //Given a list of strings, filter out the strings that have length greater than 5 and convert them to uppercase.

        List<String> filteredANdUppercase = words.stream()
                .filter(s -> s.length()>5)
                .map(String::toUpperCase)           // .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("Filtered and Uppercase words: "+filteredANdUppercase);


        Integer[] num = {5,8,12,15,20,3,9,7,11}; // Given a list of integers, find the product of all the numbers that are greater than 10.

        int product = Arrays.stream(num)
                .filter(n -> n>10)
                .reduce(1,(a,b)-> a*b);

//        Optional<Integer> productOptional = Arrays.stream(num)
//                .filter(n -> n>10)
//                .reduce((a,b)-> a*b);

        System.out.println("Product of numbers greater than 10: "+product);

        String[] s = {"Hello","world","Java","Stream","API"};

        //  Given a list of strings, find and print the longest string.
        String longestString = Arrays.stream(s)
                .max((s1,s2) -> s1.length() - s2.length())
                .orElse("");

        System.out.println("Longest string : "+longestString);

        //Given a list of strings, concatenate all the strings together, separated by a comma.
        String concatenatedString = Arrays.stream(s)
                .reduce((s1, s2) -> s1 +" "+s2)
                .orElse("");

        System.out.println("Concatenated string : "+concatenatedString);

    }

}
