package com.javarush.task.pro.task13.task1319;

/*
Месяцы в сезоне
*/

import java.util.ArrayList;
import java.util.Collections;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths(){
        Month[] arrayListWinter = new Month[3];
        arrayListWinter[0] = DECEMBER;
        arrayListWinter[1] = JANUARY;
        arrayListWinter[2] = FEBRUARY;
        return arrayListWinter;
    }

    public static Month[] getSpringMonths(){
        Month[] arrayListSpring = new Month[3];
        arrayListSpring[0] = MARCH;
        arrayListSpring[1] = APRIL;
        arrayListSpring[2] = MAY;
        return arrayListSpring;
    }

    public static Month[] getSummerMonths(){
        Month[] arrayListSummer = new Month[3];
        arrayListSummer[0] = JUNE;
        arrayListSummer[1] = JULY;
        arrayListSummer[2] = AUGUST;
        return arrayListSummer;
    }

    public static Month[] getAutumnMonths(){
        Month[] arrayListAutumn = new Month[3];
        arrayListAutumn[0] = SEPTEMBER;
        arrayListAutumn[1] = OCTOBER;
        arrayListAutumn[2] = NOVEMBER;
        return arrayListAutumn;
    }

}
