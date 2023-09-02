package com.dsa.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {12, 11, 23, 21, 33, 22, 12, 23, 42, 12, 23};
        int[] span = spanOfStock(arr);
        Arrays.stream(span).forEach(System.out::println);
    }

    private static int[] spanOfStock(int[] arr) {
        int[] span = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        span[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return span;
    }
}