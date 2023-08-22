package com.dsa.numberSystem;

import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the base value : ");
        int base = s.nextInt();

        System.out.println("Enter first number : ");
        int num1 = s.nextInt();

        System.out.println("Enter Second number :");
        int num2 = s.nextInt();

        System.out.println(getSum(num1,num2,base));

    }

    public static int getSum(int num1, int num2, int base) {
        int result = 0;

        int carry = 0;

        int pow = 1;

        while(num1 > 0 || num2 > 0 || carry > 0) {
            int d1 = num1 % 10;
            int d2 = num2 % 10;

            num1 = num1/10;
            num2 = num2/10;

            int sum = d1 + d2 + carry;
            carry = sum/base;

            sum = sum % base;

            result = result + sum*pow;

            pow = pow *10;
        }

        return result;
    }


}


// num1=236, num2=754, base=8
// result - 1212
