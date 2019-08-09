## 线程

- 线程来自OS
- Java中的线程对象映射到OS中
- 线程的管理操作还是映射到OS中

> OS 是管理计算机资源，内存和cpu时间，主要是线程调度

### 参考
- https://medium.com/@unmeshvjoshi/how-java-thread-maps-to-os-thread-e280a9fb2e06 java 线程和Linux线程的map

## 锁

- 就内存中的一个标识
- 获取和释放一个锁就是尝试修改这个标识的状态
- 通过CPU系统的三种方式保证操作的原子性

### 参考
- https://blog.csdn.net/qq_35181209/article/details/78026636 所实现的原理

## 问题

- "锁到底是啥"，这么实现的
- 为什么需要锁
