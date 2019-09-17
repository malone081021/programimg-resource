package com.malone.netty.firstexample;

import com.sun.security.ntlm.Server;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.sctp.nio.NioSctpServerChannel;

public class TestServer {
    public static void main(String[] args) throws InterruptedException {
        // 死循环 所有服务都一样 tomcat 也是
        // 负责接收链接
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        // 处理链接
        EventLoopGroup workGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(bossGroup,workGroup)
                    .channel(NioSctpServerChannel.class)
                    .childHandler(new TestServeInitializer());
            ChannelFuture channelFuture = serverBootstrap.bind(8899).sync();
            channelFuture.channel().closeFuture().sync();
        }finally {
            bossGroup.shutdownGracefully();
            workGroup.shutdownGracefully();
        }



    }
}
