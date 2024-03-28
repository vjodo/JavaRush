package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;
import static java.lang.Math.*;

/*
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber > 0) {
            String result = "";
            while (decimalNumber != 0) {
                if (decimalNumber >= 2) {
                    result = result + String.valueOf(decimalNumber % 2);
                    decimalNumber = decimalNumber / 2;
                } else {
                    result = result + String.valueOf(decimalNumber % 2);
                    decimalNumber = 0;
                }
            }
            String reversed = new StringBuilder(result).reverse().toString();
            return reversed;
        } else {
            return "";
        }
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == null) {
            return 0;
        } else {
            int x = 0;
            int result = 0;
            char numberPlace;
            for (int i = 0; i < binaryNumber.length(); i++) {
                numberPlace = binaryNumber.charAt(i);
                x = Character.getNumericValue(numberPlace);
                x = x * (int) Math.pow(2, (binaryNumber.length() - i - 1));
                result += x;
            }
            return result;
        }
    }
}