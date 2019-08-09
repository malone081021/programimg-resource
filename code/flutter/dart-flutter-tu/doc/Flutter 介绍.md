
## 绘图的基本原理

![image](https://user-images.githubusercontent.com/43690259/46727025-434a7c00-ccb2-11e8-8227-aa083f6b8932.png)

- CPU将计算好的显示内容提交给 GPU，【关注】
- GPU渲染后放入帧缓冲区，【关注】
- 然后视频控制器按照 VSync信号从帧缓冲区取帧数据传递给显示器显示。

> 图片来自 https://mp.weixin.qq.com/s/CQQXD0TrlbaNWjoClIcDtw

## 参考
- https://mp.weixin.qq.com/s/CQQXD0TrlbaNWjoClIcDtw

## Flutter 工作原理

<div style="display:inline-block">
 <img style="display:inline-block" width="400px" src="https://user-images.githubusercontent.com/43690259/46912285-c6feb400-cfa3-11e8-96b1-9bef6d814250.png">

  <img style="display:inline-block" src="https://user-images.githubusercontent.com/43690259/46912262-358f4200-cfa3-11e8-81b8-b463bc4dd3d8.png" width="350px">
 </div>
 
解释

- 用户的输入
- 动画的进度更新
- 视图数据的“build”，数据填充。 【关注】
- 视图才会进行布局，计算各个组件的大小【关注】
- 生成每个视图的视觉数据。【关注】
- 视图合成，将多个视图数据合成为一个 【关注】
- “光栅化”，矢量描述数据 --> 像素填充数据。【关注】

### 参考
- https://www.youtube.com/watch?v=UUfXWzp0-DU

## Flutter Dart Framework 和 engine

![image](https://user-images.githubusercontent.com/43690259/46727454-38dcb200-ccb3-11e8-9bb7-ae16f35571c2.png)

整个Flutter由Dart Framework 框架 和 engine 组成

engine是Flutter应用的运行时，包括skia和dart VM

开发主要使用Dart语言

### 参考
- https://flutter.io/technical-overview/

## 原理比较

react native 

![image](https://css-tricks.com/wp-content/uploads/2018/08/flutter-01.png)

依靠平台提供的能力渲染

平台和应用需要通过JavaScript 桥通信

Flutter

![image](https://css-tricks.com/wp-content/uploads/2018/08/flutter-02.png)

有自己的渲染引擎

可以直接接受本地事件等

### 参考 
- https://flutterbyexample.com/about-flutter
