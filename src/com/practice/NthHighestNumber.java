package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NthHighestNumber {

    public static int findNthHighest(int[] array, int n) {

        if(n<1 || n>array.length) {
            System.out.println("Invalid value of n");
            return -1;
        }

        Arrays.sort(array);

        return array[array.length - n];

    }

    public static boolean isEqualArray(int[] a1, int[] a2){
        return Arrays.equals(a1,a2);
    }

    public static void main(String[] args){

        int[] numbers = {5,4,6,2,1};
        int[] arr2  = {5,4,6,1,2};

        boolean isEqual = isEqualArray(numbers,arr2);
        System.out.println(isEqual);
        int n = 3;

        int nthHighest = findNthHighest(numbers,n);

        System.out.println(nthHighest);

    }
}
