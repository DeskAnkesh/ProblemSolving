package com.dsa.numberSystem;

import java.util.Scanner;

public class AnyBaseSubtraction {
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

    private static int getSum(int num1, int num2, int base) {
        int result = 0;

        int carry = 0;

        int pow = 1;

        while(num2 > 0) {
            int d1 = num1 % 10;
            int d2 = num2 % 10;

            num1 = num1/10;
            num2 = num2/10;

            int diff = 0;
            d2 = d2 +carry;

            if (d2 >= d1) {
                carry = 0;
                diff = d2 - d1;
            } else {
                carry = -1;
                diff = d2 + base - d1;
            }


            result = result + diff*pow;
            pow = pow *10;
        }

        return result;
    }


}

// num1=256, num2=1212, base=8
// result - 734
