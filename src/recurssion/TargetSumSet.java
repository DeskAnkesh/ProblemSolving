package recurssion;

import java.util.Scanner;

public class TargetSumSet {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=scanner.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the values of array of length"+n);
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();

        }
        System.out.println("Enter the target sum value: ");
        int target=scanner.nextInt();
        printTargetSum(arr,0,"",0,target);
    }

    private static void printTargetSum(int[] arr, int idx, String set, int sumSofar, int target) {
        if (idx==arr.length){
        if (sumSofar==target){
            System.out.println(set+".");
        }
        return;}
        printTargetSum(arr,idx+1,set+arr[idx]+",",sumSofar+arr[idx],target);
        printTargetSum(arr,idx+1,set,sumSofar,target);
    }
}
