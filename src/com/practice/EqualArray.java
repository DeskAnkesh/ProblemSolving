package com.practice;

import java.util.HashSet;
import java.util.Set;

public class EqualArray {

    public static boolean isEqualArray(int[] a1,int[] a2){

        if(a1.length != a2.length){
            return false;
        }

        Set<Integer> s = new HashSet<>();

        for(int num : a1){
            s.add(num);
        }

        for(int num : a2) {
            if (!s.contains(num)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,2,3,4,9};

        boolean isEqual = isEqualArray(array1,array2);

        System.out.println(isEqual);

    }
}
