package com.javarush.task.pro.task10.task1010;

import java.util.Objects;

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (!(obj instanceof Iphone))
            return false;
        Iphone iphone = (Iphone) obj;

        if (price != iphone.price) {
            return false;
        } else if (model == iphone.model && color == iphone.color) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}