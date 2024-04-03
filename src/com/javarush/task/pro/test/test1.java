package com.javarush.task.pro.test;

import java.util.Arrays;
import java.util.StringTokenizer;

public class test1 {
    public static void main(String[] args) {
        String query = "java.util.stream";
        String delimiter = "\\.";
        StringTokenizer s = new StringTokenizer(query, delimiter);
        String[] token = new String[3];
        int i = 0;
        while (s.hasMoreTokens()){
            token[i] = s.nextToken();
            i++;
        }
        System.out.println(Arrays.toString(token));
    }
}
