package com.javarush.task.pro.test;

public class Test1 {

    private int x;
    private int y;

    public Test1(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(dvl());
    }
    public int dvl(){
        int p = x + y;
        return p;
    }
}
class Test2 {
    public static void main(String[] args) {
        Test1 s = new Test1(51, 6);
//        System.out.println(s);
    }
}


