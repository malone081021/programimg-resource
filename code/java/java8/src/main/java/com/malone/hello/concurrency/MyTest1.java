package com.malone.hello.concurrency;

/**
 * wait 不是在线程对象上调用的，sleep是在线程对象上调用的
 */
public class MyTest1 {

    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        synchronized(object) {
            // 调用之前，获取锁，才能调用wait
            object.wait(1000); // 调用之后，释放对象锁
            // Thread sleep 不释放锁的所有权
        }
    }
}
