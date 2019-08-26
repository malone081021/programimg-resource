package com.malone.hello.concurrency.concurrency1;

/**
 * JVM 中的同步是基于进入与退出监视器对象（管程对象）（Monitor）来实现，每个对象实例都会有一个Monitor对象，Monitor对象会和
 * Java对象一同创建和销毁。Monitor对象是由C++来实现的。
 *
 * 当多个线程同时访问一段同步代码时，这些线程会被放到一个EntryList集合当中，处于阻塞状态的线程都会被放到该列表当中。接下来，当线程获取对象
 * 的Monitor时，Monitor是依赖于底层操作系统的mutex lock来实现互斥的，线程获取mutex成功，则会持有该mutex，这时其他线程无法再获取该mutex。
 *
 *
 *
 */
public class MyTest3 {
    public synchronized void method(){
        System.out.println("hello world");
    }
}
