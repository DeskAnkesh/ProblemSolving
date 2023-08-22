package com.dsa.numberSystem;

import java.util.Scanner;

public class AnyBaseToDecimal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = s.nextInt();

        System.out.println("Enter the base value : ");
        int base = s.nextInt();

        System.out.println(anyBaseToDecimal(num,base));

    }

    public static int anyBaseToDecimal(int num, int base) {
        int result = 0;
        int pow = 1;

        while(num>0) {


            int rem = num % 10;
            num = num/10;

            result += rem * pow;

            pow *= base;

        }

        return result;
    };

}
