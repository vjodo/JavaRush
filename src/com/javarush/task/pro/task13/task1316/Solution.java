package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] javarushQuest = JavarushQuest.values();
        for (JavarushQuest java : javarushQuest){
            System.out.println(java.ordinal());
        }
    }
}

