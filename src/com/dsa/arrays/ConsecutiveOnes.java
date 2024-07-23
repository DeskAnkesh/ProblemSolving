package com.dsa.arrays;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] prices = {1, 1, 0, 1, 1, 1};
        System.out.println(findGreatestConsecutiveOnes(prices));
    }

    public static int findGreatestConsecutiveOnes(int[] arr) {
        int len = arr.length;
        // i j -> i ko badhao j aur jab arr[i] ! = 1 hai tab j ko i k equal kar do.. aur jab tak arr[i] ==1 hai tab tak ek curcon me data rako aur fir last me overallcurr se compare kar lo
        int overAllCon = 0;
        int currCon = 0;
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] != 1) {
                j = i;
                currCon=0;
            } else if (arr[i] == 1) {
                currCon++;
            }
            overAllCon = Math.max(currCon, overAllCon);
        }
        return overAllCon;
    }
}
