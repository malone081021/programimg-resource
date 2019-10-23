package com.malone;

public class Main {

    public static void main(String[] args) {
        Array arr = new Array();
        arr.addLast(100);
        arr.addLast(122);
        arr.addLast(500);
        arr.addLast(66);

        System.out.println(arr);

        arr.removeElement(122);
        System.out.println(arr);

        arr.addLast(5555);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);
    }
}
