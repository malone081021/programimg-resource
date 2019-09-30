- 没有请求路由
- 更底层，性能更好
- socket 开发 ？？
- 长连接开发 ？？
- 可以作为客户端和服务端
- NIO 编程重点，底层
- websoket 应用协议 补充 http协议 
    - 长连接 
    - 服务端 push
    - 没有头，只发送数据
    
    
    RMI 
        限制：只能是Java
    client: stub
    
    server: skeleton
    
    序列化和反序列化  编码和解码
    
    RPC remote procedure call  跨语言
    
    1.定义接口说明文文件：描述了对象（结构体）、对象成员、接口方法等一系列信息；
    2.通过RPC框架所提供的编译器，将接口说明文件编译成具体的语言文件。
    3.在客户端与服务器端分别引入RPC编译器所生成的文件，即可想调用本地方法调用；
    
## 13,14,15,16 protobuf 

## 17 protobuf  Thrift

1.git共享protobuf产生的文件
>使用submodule：git仓库中的一个仓库
- protobuf-java：生成的Java代码
- 通过submudle的方式在不同的仓库中共享
- 共同一个单独的仓库存放proto文件
2.多个中消息类型的处理

​    gitsubtree - RPC 中间代码管理

## Thrift 18 19 

> 和 protobuf 

mac homebrew 安装各种软件 thrift

安装 thrift，编写IDL ，生成代码，编写server和client 通信



## IO 

节点流/

## 36 文件通道用法详解

NioTest4

只读Buffer / 直接Buffer

## 37 Buffer 详解

类型化的get和put

```java
buffer putInt() getInt()
```

`方法替换使用Tab`

- **DirectByteBuffer** // 堆外内存 ，直接内存，**没有copy**，直接IO

  > 通过在**DirectByteBuffer** 对象addres 应用本地内存，释放内存需要 `unsafe` 方法

- 普通Buffer数据copy 

 **从Java 内存空间数据 到 系统空间** ，【为什么copy，GC的影响】

**再次和IO设别交互**

## 39

映射文件

## 40 

- 网络编程
  - ServerSocket serverSocket
  - bind 
  -  Socket socket = serverSocket.accept // 阻塞
  - 建立链接【端口】和数据传递[另一个端口]





## NIO 学习资源

- [https://muyinchen.github.io/2018/11/02/Java%E7%BC%96%E7%A8%8B%E6%96%B9%E6%B3%95%E8%AE%BA-%E5%93%8D%E5%BA%94%E5%BC%8F%20%E4%B9%8B%20Rxjava%E7%AF%87%20%E6%BA%90%E7%A0%81%E8%A7%A3%E8%AF%BB%E7%B3%BB%E5%88%97/](https://muyinchen.github.io/2018/11/02/Java编程方法论-响应式 之 Rxjava篇 源码解读系列/)