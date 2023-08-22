package com.practice;

import java.util.Arrays;

public class TripletSum0 {

    public static boolean tripletSum(int[] a) {
        Arrays.sort(a);
        for(int i=0;i<a.length-2;i++){
            int l = i+1;
            int r = a.length-1;

            while(l<r){
                int sum = a[i]+a[l]+a[r];
                if(sum==0){
                    return true;
                } else if (sum<0){
                    l++;
                } else {
                    r--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){

        int[] arr = {-1,2,-1,4,5,6,7};

        boolean tripletSumExist = tripletSum(arr);

        System.out.println(tripletSumExist);

    }
}
