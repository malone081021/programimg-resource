package com.malone.jvmdemo;

/**
 * 当一个接口初始化时并不要求其父接口初始化【删除MyParent5】运行
 * 只有在真正使用到父接口的时候，（如引用接口中所定义的常量时），才会初始化
 *
 * 
 */
public class MyTest5 {

    public static void main(String[] args) {
        System.out.println(Mychild5.b);
    }

}

interface MyParent5 {
    public static int a = 5;
}

interface Mychild5 extends MyParent5 {
    public static int b = 6;
}