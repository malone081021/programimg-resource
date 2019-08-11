package com.malone.hello.function;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        // 行为定义
        Predicate<String> predicate = p -> p.length() > 5;
        // 方法的执行
        System.out.println(predicate.test("222222222222222222222"));
    }
}
