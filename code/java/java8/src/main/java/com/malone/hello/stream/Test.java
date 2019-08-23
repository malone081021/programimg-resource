package com.malone.hello.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * map value 的顺序是固定的吗
 *  或者
 */
public class Test {
    public static void main(String[] args) {
        List<Weather> ws = new ArrayList<>();
        ws.add(new Weather(10,20,15));
        ws.add(new Weather(11,28,15));
        ws.add(new Weather(12,20,13));
        ws.add(new Weather(13,25,17));
        ws.add(new Weather(14,20,15));
        Map<Integer,Weather> map = new HashMap<>();
        map.put(1,new Weather(10,20,15));
        map.put(2,new Weather(11,28,15));
        map.put(3,new Weather(12,20,13));
        map.put(4,new Weather(13,25,17));
        map.put(5,new Weather(14,20,15));
        map.values().stream().map(w -> w.getMaxTem()).collect(Collectors.toList());
        System.out.println( map.values().stream().map(w -> w.getMaxTem()).collect(Collectors.toList()));
    }
}
