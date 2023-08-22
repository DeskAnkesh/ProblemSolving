package com.practice;

import java.util.Arrays;

public class noOfOccurence {

    public static int count(int[] arr, int n) {
//        int count=0;
//        for (int i =0; i<arr.length; i++){
//            if(arr[i]==n){
//                count++;
//            }
//        }
//        return count;

        int[] filteredArray = Arrays.stream(arr).filter(a -> a == n).toArray();

        return filteredArray.length;
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 1};
        int number = 9;

        int result = count(array, number);

        System.out.println(result);

    }

}
