package com.malone.jvmdemo;

import java.util.UUID;

/**
 * 对于数组实例来说，其类型是由JVM在运行期动态生成的，表示为数组引用的getClass的名字，动态生成的类型的父类型是Object
 * 对于数组中常说的component，就是数组将第一维之后的类型
 *
 * 助记符
 * anewarray 表示创建一个引用类型的（如 类、接口、数组）数组，并将其引用值压入栈顶
 * newarray  创建一个指定的原始类型的数组，并将引用压入栈顶
 */
public class MyTest4 {

    public static void main(String[] args) {
        // 首次主动使用
        MyParent4 p = new MyParent4();
        // 并不是主动使用
        MyParent4[] myParent4s = new MyParent4[1];
        // 数据的类型是动态生成的，是不提前定义的
        System.out.println(myParent4s.getClass());
        System.out.println(myParent4s.getClass().getSuperclass());
        System.out.println(myParent4s.getClass().getSuperclass());
        System.out.println("=======================");
        int [] ints = new int[1];
        System.out.println(ints.getClass());
        boolean [] booleans = new boolean [1];
        System.out.println(booleans.getClass());
        short [] shorts = new short[1];
        System.out.println(shorts.getClass());
        byte [] bytes = new byte[1];
        System.out.println(bytes.getClass());
    }

}

class MyParent4 {
    static {
        System.out.println("MyParent4 static codes");
    }
}
