package com.malone.hello.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest5 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","helloworld","test");

        list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
    }
}
