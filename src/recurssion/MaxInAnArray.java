package recurssion;

import java.util.Scanner;

public class MaxInAnArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= scanner.nextInt();
        }
        int max=maxOfArray(arr,0);
        System.out.println(max);
    }

    private static int maxOfArray(int[] arr, int i) {
        if (i == arr.length-1) {
            return arr[i];
        }
        int maxInSmallerArray=maxOfArray(arr,i+1);
        if (maxInSmallerArray>arr[i]){
            return maxInSmallerArray;
        }
        else return arr[i];

    }
}
