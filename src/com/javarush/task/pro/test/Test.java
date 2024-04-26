package com.javarush.task.pro.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        test();
    }

    public static void test()
    {
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();

        for(StackTraceElement info: methods)
        {
            System.out.println(info.getClassName());
            System.out.println(info.getMethodName());
            System.out.println();

            System.out.println(info.getFileName());
            System.out.println(info.getLineNumber());
            System.out.println();

            System.out.println(info.getModuleName());
            System.out.println(info.getModuleVersion());
            System.out.println("_____________________________________________");
        }
    }
}
