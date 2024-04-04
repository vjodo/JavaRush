package com.javarush.task.pro.task09.task0918;

/*
Поработаем со StringBuilder
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder string1 = new StringBuilder(string);
        for (int i = 0; i < strings.length ; i++) {
            string1.append(strings[i]);
        }
        return string1;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder string1 = new StringBuilder(string);
        string1.replace(start, end, str);
        return string1;
    }
}
