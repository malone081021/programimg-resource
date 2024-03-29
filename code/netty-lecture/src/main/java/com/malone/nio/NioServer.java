package com.malone.nio;

import java.io.IOException;
import java.nio.channels.ServerSocketChannel;

public class NioServer {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
    }
}
