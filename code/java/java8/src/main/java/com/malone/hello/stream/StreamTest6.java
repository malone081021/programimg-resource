package com.malone.hello.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class StreamTest6 {

    public static void main(String[] args) {
       // Stream.iterate(1,item -> item +2).limit(6).forEach(System.out::println);

        System.out.println(Stream.iterate(1, item -> item +2).mapToInt(item -> item *2).skip(2).limit(2).max().getAsInt());
        Stream.iterate(1, item -> item +2).mapToInt(item -> item *2).skip(2).limit(2).max().ifPresent(System.out::println);
        IntSummaryStatistics summaryStatistics = Stream.iterate(1, item -> item +2).mapToInt(item -> item *2).skip(2).limit(2).summaryStatistics();
        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getAverage());
        System.out.println(summaryStatistics.getMin());
        // 中間也是返回Stream
    }
}
