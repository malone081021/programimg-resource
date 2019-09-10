package com.malone.hello.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest10 {

    public static void main(String[] args) {
        // 如果找到合适的就不再继续计算了
        // 对每个元素应用所有的操作 短路运算
        List<String> list = Arrays.asList("hello","world","hello world");
        list.stream().mapToInt(item -> {
            int lenght = item.length();
            System.out.println(item);
            return lenght;
        }).filter(lenght -> lenght == 5).findFirst().ifPresent(System.out::println);
    }
}
