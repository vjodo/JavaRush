package com.javarush.task.pro.task14.task1406;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.*;

/*
Купи слона
*/

class Solution {
    //public static List<String> answers = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        buyElephant(null, scanner);
    }

    static void buyElephant(String answer, Scanner scanner) {
        if (answer == null) {
            System.out.println("Купи слона");
        } else if (answer.toLowerCase().equals("ок")) {
            System.out.println("Так-то лучше :) Список твоих отговорок:");
            throw new SecurityException();
        } else {
            System.out.println("Все говорят \"" + answer + "\", а ты купи слона");
        }
        answer = scanner.nextLine();
        try {
            buyElephant(answer, scanner);
        } catch (SecurityException e) {
            System.out.println(answer);
            throw e;
        }
    }
}