package com.malone.hello.concurrency;

public class Client {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        Thread increaseThread = new IncreaseThread(myObject);
        Thread decreaseThread = new DecreaseThread(myObject);

        Thread increaseThread1 = new IncreaseThread(myObject);
        Thread decreaseThread1 = new DecreaseThread(myObject);

        increaseThread.start();
        decreaseThread.start();
        increaseThread1.start();
        decreaseThread1.start();
    }
}
