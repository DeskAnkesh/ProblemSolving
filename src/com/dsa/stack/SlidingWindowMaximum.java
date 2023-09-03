package com.dsa.stack;

import java.util.Stack;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 1, 2, 5, 6, 3, 4, 6};
        int[] nextGreaterInteger = new int[arr.length];
        int k = 4;
        Stack<Integer> stack = new Stack<>();
        stack.push(arr.length - 1);
        nextGreaterInteger[arr.length - 1] = arr.length;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nextGreaterInteger[i] = arr.length;
            } else {
                nextGreaterInteger[i] = stack.peek();
            }
            stack.push(i);
        }
        int j = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            if (j < i) {
                j = i;
            }
            while (nextGreaterInteger[j] < i + k) {
                j = nextGreaterInteger[j];
            }
            System.out.println(arr[j]);
        }
    }
}
