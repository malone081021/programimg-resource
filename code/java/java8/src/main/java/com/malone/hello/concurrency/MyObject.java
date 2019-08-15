package com.malone.hello.concurrency;

public class MyObject {

   private int counter;

   public synchronized void increase(){
            while (counter != 0) { // if 不行，唤醒之后直接往下执行，而while唤醒之后继续验证
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            counter ++;
            System.out.println(counter);
            notify();
    }

    public synchronized void descrease() {

        while (counter != 1) { // if 不行，唤醒之后直接往下执行，而while唤醒之后继续验证
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        counter --;
        System.out.println(counter);
        notify();
    }

}
