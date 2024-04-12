package com.javarush.task.pro.test;

import java.util.Calendar;

public class Test {
    public static void tester(int a) {


        int b = a + 30;
        a = b / 2;
    }

    public static void main(String[] args) {
        int result = 4;
        tester(result);
        System.out.println(result);
        System.out.println(Calendar.getInstance().get(Calendar.YEAR));
    }
}
