package com.malone.hello.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {

    public static void main(String[] args) {
        // 如果找到合适的就不再继续计算了
        // 对每个元素应用所有的操作 短路运算
        List<String> list = Arrays.asList("hello welcome","world hello","hello world hello","hello welcome");
        // distinct 的是多个list·
        list.stream().map(item -> item.split(" ")).distinct().collect(Collectors.toList());
        // flatMap 整合多个Stream 到一个Stream
        list.stream().map(item -> item.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()).forEach(System.out::println);

    }
}
