package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer s = new StringTokenizer(query, delimiter);
        int i =0;
        String p = "";
        while (s.hasMoreTokens()){
            p = s.nextToken();
            i++;
        }
        String[] token = new String[i];
        i = 0;
        StringTokenizer s1 = new StringTokenizer(query, delimiter);
        while (s1.hasMoreTokens()) {
            token[i] = s1.nextToken();
            i++;
        }
        return token;
    }
}
