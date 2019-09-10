package com.malone.jvmdemo;

import java.util.UUID;

/**
 * // 不是编译期间的常量，所以整个类会初始化，所以会初始化；相对于
 * @see MyTest2 中的情形
 */
public class MyTest3 {

    public static void main(String[] args) {
        System.out.println(MyParent3.str);
    }

}

class MyParent3 {
    // 不是编译期间的常量，所以整个类会初始化，所以会初始化；
    public static final String str = UUID.randomUUID().toString();

    static {
        System.out.println("MyParent3 static codes");
    }
}
