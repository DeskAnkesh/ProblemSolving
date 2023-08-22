package recurssion;

import java.util.Scanner;

public class FirstIndexInAnArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= scanner.nextInt();
        }
        int d=scanner.nextInt();
        int firstIndex=findFirstindex(arr,0,d);
        System.out.println(firstIndex);

    }

    private static int findFirstindex(int[] arr, int i, int d) {
        if (i == arr.length) {
            return -1;
        }
//        int firstIndexInSmallerArray=findFirstindex(arr, i+1, d);
//        if (arr[i] == d) {
//            return arr[i];
//        }
//        else {
//            return firstIndexInSmallerArray;
//        }
        if (arr[i] == d) {
            return i;
        }
        else {
            int firstIndexInSmallerArray=findFirstindex(arr,i+1,d);
            return firstIndexInSmallerArray;
        }

    }
}
