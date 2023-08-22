package com.dsa.numberSystem;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = s.nextInt();

        System.out.println("Enter the source base value : ");
        int sourceBase = s.nextInt();

        System.out.println("Enter the target base value : ");
        int targetBase = s.nextInt();



        int decValue = AnyBaseToDecimal.anyBaseToDecimal(num, sourceBase);

        int result = DecimalToAnyBase.decimalToAnyBase(decValue, targetBase);

        System.out.println(result);


    }
}
