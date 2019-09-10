package com.malone.hello.defaultmethod;

/**
 *   default 方法是为了兼容之前代码
 *    例如 List sort 方法
 */
public class MyClass extends MyInterfaceImpl implements MyInterface2 {

    @Override
    public void myMethod() {
        MyInterface2.super.myMethod();
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod();
    }
}
