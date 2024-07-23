package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindUnionOfTwoArrays {
    public static void main(String[] args) {
        int [] arr1= {1, 12, 12, 11, 2, 12, 3, 4};
        int [] arr2 ={2,12,22,11,3,4,5,6,7};
        var result1=unionSolution1(arr1,arr2, arr1.length, arr2.length);
        result1.forEach(
                System.out::println
        );
    }
    public static ArrayList<Integer> unionSolution1(int []arr1, int[]arr2, int n, int m){
        var freq= new HashMap<Integer,Integer>();
        var union= new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
            

        }
        for (int i = 0; i < m; i++) {
            freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
        }
       for (Map.Entry<Integer,Integer> entrySet:freq.entrySet()){
           System.out.println("key is "+ entrySet.getKey() +" value is "+entrySet.getValue());
        }
        for (int keys: freq.keySet()){
            union.add(keys);
        }
        return union;

    }
}
