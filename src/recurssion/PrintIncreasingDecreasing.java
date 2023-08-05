package recurssion;

import java.util.Scanner;

public class PrintIncreasingDecreasing {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        pdi(n);

    }

    private static void pdi(int n) {
        if (n == 0) {
            return;

        }
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}
