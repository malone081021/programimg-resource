package com.malone.hello.defaultmethod;

public interface MyInterface2 {
    default void myMethod(){
        System.out.println("MyInterface2");
    }
}
