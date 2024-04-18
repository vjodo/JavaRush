package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/*
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Sidzinpin", 3.8);
        grades.put("Baiden", 1.8);
        grades.put("Putin", 5.0);
        grades.put("Stalin", 4.5);
        grades.put("Lenin", 4.0);

    }
}
