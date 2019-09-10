package com.malone.hello.function.supplier;

import java.util.function.Supplier;

public class StudentTest {

    public static void main(String[] args) {
        Supplier<Student> supplier = () -> new Student();
        System.out.println(supplier.get().getName());

        System.out.println("=========================");

        Supplier<Student> supplier1 = Student::new;
        System.out.println(supplier1.get().getName());

    }
}
