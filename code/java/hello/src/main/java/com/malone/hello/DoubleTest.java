package com.malone.hello;

import java.text.DecimalFormat;

public class DoubleTest {
    public static void main(String[] args) {
        Double value = 3.01225855;
        Float ff = Float.valueOf(new DecimalFormat("0.00").format(value));
        System.out.println(ff);
    }
}
