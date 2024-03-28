package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/*
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber > 0) {
            int index = 0;
            String result = "";
            while (decimalNumber != 0) {
                if (decimalNumber >= 16) {
                    index = decimalNumber % 16;
                    char numberPlace = HEX.charAt(index);
                    result += String.valueOf(numberPlace);
                    decimalNumber /= 16;
                } else {
                    result += String.valueOf(decimalNumber);
                    decimalNumber = 0;
                }
            }
            String reversed = new StringBuilder(result).reverse().toString();
            return reversed;
        } else {
            return "";
        }
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == null || hexNumber == "") {
            return 0;
        } else {
            int x = 0;
            int result = 0;
            String index = "";
            char symbol;
            for (int i = 0; i < hexNumber.length(); i++) {
                symbol = hexNumber.charAt(i);
                index = String.valueOf(symbol);
                x = HEX.indexOf(index) * (int) Math.pow(16, (hexNumber.length() - i - 1));
                result += x;
            }
            return result;
        }
    }
}
