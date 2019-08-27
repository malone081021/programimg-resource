package com.malone.jvmdemo;

/**
 * -XX:+TraceClassLoading
 * -XX:+TraceClassUnloading
 *
 * -XX: 开始
 * -XX:+ <option> 开启
 * -XX:- <option> 关闭
 * -XX:<option>=value 表示option 设置为value
 *
 */
public class MyTest1 {

    public static void main(String[] args) {
        System.out.println(MyParent1.str);
    }
}

class MyParent1 {
    public static String str = "hello world";

    static {
        System.out.println("MyParent1 static block");
    }
}

class  MyChild1 extends MyParent1 {
    public static   String str2 = "wlecome";

    static {
        System.out.print("MyChild1 static block");
    }
}