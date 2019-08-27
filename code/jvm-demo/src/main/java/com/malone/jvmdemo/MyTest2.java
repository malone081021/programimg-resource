package com.malone.jvmdemo;

/**
 *  助记符：ldc
 *  将int float string 类型的常量池推送到栈顶
 *  bipush 表示将 -128 - 127 推送到栈顶
 *  sipush 表示将短整型常量值【-32768 - 32768】推送到栈顶
 *  iconst_m1 - iconst_5 将1-5推送到到栈顶
 */
public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(MyParent2.m);
    }
}

class MyParent2 {
    // javap -c com.malone.jvmdemo.MyTest2
    // final 编译时就会被存入调用这个变量的方法的常量池中
    // 实质是调用这个类的常亮，并没有直接引用这个类，所以这个类不会初始化
    // 注意将常量存入到了 MyTest2 的常量池中
    // 所以理论上删除MyParent2的class文件也是可以访问常量的
    public static final String str = "hello world"; // 加和不加 final
    public static final int s = 7; //
    public static final int m = 1; //
    // 类的加载问题
    static {
        System.out.print("MyParent2 static block \n");
    }
}