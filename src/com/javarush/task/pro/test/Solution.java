package com.javarush.task.pro.test;

import static java.lang.Math.*;

public class Solution {


    public static void main(String[] args) {
        String hexNumber = "abcdef";
        String HEX = "0123456789abcdef";
        String compare = "1";
        String symbol = "";
        String x = "";

        if (hexNumber != null) {
            int[] resultInter = new int[hexNumber.length()];
            for (int i = 0; i < hexNumber.length(); i++) { //создание массива и преверка на совпадение с 16тиричными символами
                if (compare.equals("1")) {
                    symbol = String.valueOf(hexNumber.charAt(i));
                    for (int j = 0; j < HEX.length(); j++) {
                        if ((String.valueOf(HEX.charAt(j))).equals(symbol)) {
                            compare = "1";
                            resultInter[i] = HEX.indexOf(symbol);
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
                for (int i = 0; i < hexNumber.length(); i++) {
                    String result = "";
                    while (resultInter[i] != 0) {
                        if (resultInter[i] >= 2) {
                            result = result + String.valueOf(resultInter[i] % 2);
                            resultInter[i] = resultInter[i] / 2;
                        } else {
                            result = result + String.valueOf(resultInter[i]);
                            break;
                        }
                    }
                    while (result.length() < 4 && i != 0) {
                        result += "0";
                    }
                    String reversed = new StringBuilder(result).reverse().toString();
                    x += reversed;
                    System.out.println(reversed);
                }
                System.out.println(x);
            } else {
                System.out.println("");
            }
        } else {
            System.out.println("");
        }
    }
}
