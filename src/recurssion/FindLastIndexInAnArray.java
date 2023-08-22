package recurssion;

import java.util.Scanner;

public class FindLastIndexInAnArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= scanner.nextInt();
        }
        int x=scanner.nextInt();
        int lastIndex=findLastIndex(arr,0,x);
        System.out.println(lastIndex);

    }

    private static int findLastIndex(int[] arr, int i, int x) {
        if (i == arr.length) {
            return -1;
        }
        int lastIndexInSmallerArray=findLastIndex(arr,i+1,x);
        if (lastIndexInSmallerArray == -1) {
            if (arr[i] == x) {
                return i;

            }
            else {
                return -1;
            }

        }
        else {
            return lastIndexInSmallerArray;
        }

    }
}
