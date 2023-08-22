package recurssion;

import java.util.Scanner;

public class DisplayTheArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= scanner.nextInt();
        }
       // display(arr,0);
        displayArrayReverse(arr,0);

    }

    public static void displayArrayReverse(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        displayArrayReverse(arr,i+1);
        System.out.println(arr[i]);

    }
    //Expectation -> idx se end tak sab print kar dega..
    //Faith -> idx+1 se end tak sab print karna janta hai..

    private static void display(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        display(arr,idx+1);


    }
}
