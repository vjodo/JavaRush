package com.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/*
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        if (decimalNumber > 0) {
            String result = "";
            while (decimalNumber != 0) {
                if (decimalNumber >= 8) {
                    result = result + String.valueOf(decimalNumber % 8);
                    decimalNumber = decimalNumber / 8;
                } else {
                    result = result + String.valueOf(decimalNumber % 8);
                    decimalNumber = 0;
                }
            }
            String reversed = new StringBuilder(result).reverse().toString();
            return Integer.valueOf(reversed);
        } else {
            return 0;
        }
    }

    public static int toDecimal(int octalNumber) {
        if (octalNumber > 0) {
            int b = String.valueOf(octalNumber).length();
            int[] x = new int[b];
            int result = 0;
            for (int i = 0; i < b; i++) {
                x[i] = (octalNumber % (int) Math.pow(10, (b - i))) / (int) Math.pow(10, (b - i - 1));
                x[i] = x[i] * (int) Math.pow(8, (b - i - 1));
                result = result + x[i];
            }
            return result;
        } else {
            return 0;
        }
    }
}
