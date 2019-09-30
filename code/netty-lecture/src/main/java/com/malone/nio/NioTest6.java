package com.malone.nio;

import java.nio.ByteBuffer;

public class NioTest6 {

    public static void main(String[] args) {
        ByteBuffer buffer =ByteBuffer.allocate(10);
        buffer.limit();

        for (int i = 0;i < buffer.capacity();i++) {

        }
    }
}
