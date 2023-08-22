package com.practice;

import java.util.Arrays;

public class firstAndLastOccurence {

    public static int[] solution(int[] arr, int n) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                first = i;
                break;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == n) {
                last = i;
                break;
            }
        }

        return new int[]{first, last};
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 67, 1};

        int number = 1;

        int[] result = solution(array,number);

        System.out.println(Arrays.toString(result));

    }
}
