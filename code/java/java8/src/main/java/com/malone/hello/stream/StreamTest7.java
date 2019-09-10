package com.malone.hello.stream;

import java.util.stream.Stream;

public class StreamTest7 {

    public static void main(String[] args) {
        // 重点关注 中间操作，没有终止操作，整个流处理是不会执行的
        Stream.iterate(1,item -> item +1).map( item -> {
            System.out.println(item);
            return item;
        });
    }

    // Stream 对数据的处理，类似完型填空,添加关键系统，将自己定义的代码和流框架结合
    // Stream 的设计更加的抽象，代码就是数据 code as data model
    // 流关注数据的计算，集合关注的是数据本身
    // 流的短路运算
}
