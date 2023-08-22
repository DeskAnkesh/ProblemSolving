package com.dsa.numberSystem;

import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the base value : ");
        int base = s.nextInt();

        System.out.println("Enter first number : ");
        int num1 = s.nextInt();

        System.out.println("Enter Second number :");
        int num2 = s.nextInt();

        System.out.println(getProduct(base, num1, num2));

    }

    public static int getProduct(int base, int num1, int num2) {
        int result = 0;
        int pow = 1;

        while (num2 > 0) {
            int d2 = num2 % 10;
            num2 = num2 / 10;

            int singleProduct = getProductWithSingleDigit(base, num1, d2);

            result = AnyBaseAddition.getSum(result, singleProduct * pow, base);
            pow = pow * 10;
        }

        return result;
    }

    public static int getProductWithSingleDigit(int base, int num1, int d2) {
        int result = 0;
        int carry = 0;
        int pow = 1;

        while (num1 > 0 || carry > 0) {
            int d1 = num1 % 10;
            num1 = num1 / 10;

            int mul = d1 * d2 + carry;
            carry = mul / base;

            mul = mul % base;

            result = result + mul * pow;
            pow = pow * 10;
        }
        return result;
    }
}
