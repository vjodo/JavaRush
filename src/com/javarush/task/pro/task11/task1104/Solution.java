package com.javarush.task.pro.task11.task1104;

/*
Конвертер строки
*/

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        int convert = (int)Math.round(Double.parseDouble(string));

        System.out.println(convert);
    }
}
