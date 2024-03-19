package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/*
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int x = array.length % 2 == 0 ?  array.length / 2 : (array.length / 2) + 1;
        Arrays.fill(array, 0, x, valueStart);
        Arrays.fill(array, x, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
