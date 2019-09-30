package com.malone.nio;

import java.nio.ByteBuffer;

/**
 * 只读Buffer
 *  可以将普通的Buffer 转化为只读Buffer ，但是不能讲只读Buffer 转化为 普通Buffer
 */
public class NioTest7 {

    public static void main(String[] args) {
        ByteBuffer buffer =ByteBuffer.allocate(10);
        buffer.limit();

        for (int i = 0;i < buffer.capacity();i++) {
            buffer.put((byte)i);
        }

        // 转化为只读Buffer
        ByteBuffer readOnlyBuffer  = buffer.asReadOnlyBuffer();

        System.out.println(readOnlyBuffer.getClass());

        readOnlyBuffer.put((byte)0);
    }
}
