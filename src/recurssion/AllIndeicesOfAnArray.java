package recurssion;

import java.util.Scanner;

public class AllIndeicesOfAnArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Length of the array: ");
        int n=scanner.nextInt();
        int []arr=new int[n];
        System.out.println("Enter values of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i]= scanner.nextInt();
        }
        System.out.println("Enter the vaue of x: ");
        int x=scanner.nextInt();
        int[] allIndeices=getAllIndeices(arr,x,0,0);
        DisplayTheArray.displayArrayReverse(allIndeices,0);

    }

    private static int[] getAllIndeices(int[] arr, int x, int idx,int foundSoFar ) {
        if (idx == arr.length) {
            return new int[foundSoFar];
        }
        if (arr[idx] == x) {
            int [] iarr=getAllIndeices(arr, x, idx+1, foundSoFar+1);
            iarr[foundSoFar]=idx;
            return iarr;

        }
        else {
            int iarr[]=getAllIndeices(arr, x, idx+1, foundSoFar);
            return iarr;
        }
    }
}
