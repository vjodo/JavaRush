package com.javarush.task.pro.task08.task0801;

import static java.lang.Math.toRadians;

/*
Утильный класс: часть 1
*/

public class Solution {

    public static double sin(double a) {
        double s = Math.sin(Math.toRadians(a));
        return s;
    }

    public static double cos(double a) {
        double c = Math.cos(Math.toRadians(a));
        return c;
    }

    public static double tan(double a) {
        double t = Math.tan(Math.toRadians(a));
        return t;
    }
}
