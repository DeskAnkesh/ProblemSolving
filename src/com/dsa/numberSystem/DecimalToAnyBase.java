package com.dsa.numberSystem;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = s.nextInt();

        System.out.println("Enter the base value : ");
        int base = s.nextInt();

        System.out.println(decimalToAnyBase(num,base));

    }

    public static int decimalToAnyBase(int num, int base) {
        int result = 0;
        int pow = 1;

        while(num>0) {


            int rem = num % base;
            num = num/base;

            result += rem * pow;

            pow *= 10;

        }

        return result;
    };
}
