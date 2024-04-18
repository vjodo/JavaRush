package com.javarush.task.pro.task13.task1313;

import java.util.ArrayList;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;

        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node node = new Node();
        ArrayList<String> array = new ArrayList<>();
        if (node.value == null){
            array.add(first);
            array.add(last);
        }
            array.add(value);


    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
