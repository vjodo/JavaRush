package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/*
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String HEX = "0123456789abcdef";
        String result = "";
        int rez = 0;
        int x = 0;
        if (binaryNumber != null) {
            String[] symbol = new String[binaryNumber.length()];
            for (int i = 0; i < binaryNumber.length(); i++) {
                symbol[i] = String.valueOf(binaryNumber.charAt(i));
                if (symbol[i].equals("0") || symbol[i].equals("1")) {
                    x = Integer.valueOf(symbol[i]);
                    x = x * (int) Math.pow(2, (binaryNumber.length() - i - 1));
                    rez += x;
                    result = String.valueOf(rez);
                } else {
                    result = "";
                    break;
                }
            }
            if (result == "") {
                return "";
            } else {
                result = "";
                while (rez != 0) {
                    if (rez >= 16) {
                        x = rez % 16;
                        char numberPlace = HEX.charAt(x);
                        result += String.valueOf(numberPlace);
                        rez /= 16;
                    } else {
                        char numberPlace = HEX.charAt(rez);
                        result += String.valueOf(numberPlace);
                        rez = 0;
                    }
                }
                String reversed = new StringBuilder(result).reverse().toString();
                return reversed;
            }
        } else {
            return "";
        }
    }

    public static String toBinary(String hexNumber) {
        String HEX = "0123456789abcdef";
        String compare = "1";
        String symbol = "";
        int x = 0;
        int resultInter = 0;

        if (hexNumber != null) {
            for (int i = 0; i < hexNumber.length(); i++) { //создание массива и преверка на совпаждение с 16тиричными символами
                if (compare.equals("1")) {
                    symbol = String.valueOf(hexNumber.charAt(i));
                    x = HEX.indexOf(symbol) * (int) Math.pow(16, (hexNumber.length() - i - 1));
                    resultInter += x;
                    for (int j = 0; j < HEX.length(); j++) {
                        if ((String.valueOf(HEX.charAt(j))).equals(symbol)) {
                            compare = "1";
                            break;
                        } else {
                            compare = "0";
                        }
                    }
                } else {
                    break;
                }
            }
            if (compare.equals("1")) {
                String result = "";
                while (resultInter != 0) {
                    if (resultInter >= 2) {
                        result = result + String.valueOf(resultInter % 2);
                        resultInter = resultInter / 2;
                    } else {
                        result = result + String.valueOf(resultInter);
                        break;
                    }
                }
                String reversed = new StringBuilder(result).reverse().toString();
                return reversed;
            } else {
                return "";
            }
        } else {
            return "";
        }
    }
}
