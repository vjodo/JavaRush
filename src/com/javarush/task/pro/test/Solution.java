package com.javarush.task.pro.test;

import static java.lang.Math.*;

public class Solution {


    public static void main(String[] args) {
        String hexNumber = "9d0ds";
        String HEX = "0123456789abcdef";
        String compare = "1";
        String symbol = "";
        int x = 0;
        int resultInter = 0;

        for (int i = 0; i < hexNumber.length(); i++) { //создание массива и преверка на совпаждение с 16тиричными символами
            if (compare.equals("1")){
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
            System.out.println(reversed);
        } else {
            System.out.println("");
        }
    }
}
