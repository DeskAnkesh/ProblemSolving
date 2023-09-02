package com.dsa.stack;

import java.util.Stack;

public class LargestAreaHistograph {
    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 1, 2, 5, 6, 3, 4, 6};

        int[] rightBoundaries = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(arr.length - 1);
        rightBoundaries[arr.length - 1] = arr.length;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                rightBoundaries[i] = arr.length;
            } else {
                rightBoundaries[i] = stack.peek();
            }
            stack.push(i);
        }

        int[] leftBoundaries = new int[arr.length];
        stack = new Stack<>();
        stack.push(0);
        leftBoundaries[0] = -1;
        for (int i = 1; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                leftBoundaries[i] = -1;
            } else {
                leftBoundaries[i] = stack.peek();
            }
            stack.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = rightBoundaries[i] - leftBoundaries[i] - 1;
            int area = width * arr[i];
            if (area > maxArea) {
                maxArea = area;
            }
        }
        System.out.println(maxArea);
    }
}
