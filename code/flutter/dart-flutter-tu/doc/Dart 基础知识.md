
本节主要介绍Dart语言的基本语言特性

- 基本变量生命
- const和final
- 内置数据类型 Number、string、list、map
- 函数、命名参数、参数默认值等
- 控制流，if/else、while、do/while、for、switch
- try/catch/finally

## Hello World

dart 版的hello world
```dart
main(List<String> args) {
  print('Hello World');
}
```
和Java语言类似，每个dart程序都有一个main，是整个程序的入口。

将程序保存到`hello_world.dart`文件中，运行查看结果

##  变量定义

类似在JavaScript中一样，你可以使用var关键字定义变量
```dart
main(List<String> args) {
  var number = 42;
  var name = 'Gurleen Sethi';
  var salary = 150300.56;
  var isDoorOpen = true;
}
```
但是，和JavaScript不同的是，在Dart2中，一旦你给变量赋值一种类型的值，就不能再赋值另一种类型的值。Dart 可以自动从右边数据推断数据类型。Dart 类型推到特性，防止程序处于一种不合理的状态，提前发现问题。

你也可以明确指定数据类型定义变量。

```dart
main(List<String> args) {
  int number = 42;
  String name = 'Gurleen Sethi';
  double salary = 150300.56;
  bool isDoorOpen = true;
}
```

如果你不想改变变量所持有的值，可以用关键字`final`或者`const`声明。

```
main(List<String> args) {
  final int number = 42;
  const String name = '小明';
 
  //省略类型
  final salary = 150300.56;
  const isDoorOpen = true;
}
```

final 和 const的不同在于，const是编译时常量。例如，const变量在编译时必须要有一个值。例如，`const PI = 3.14`,然而final变量只能被赋值一次，他不需要在编译时就赋值，可以在运行时赋值。

##  内置的数据类型

dart语言提供所有现代语言提供的所有基本数据类型。

- Numbers
- Strings
- Booleans
- Lists
- Maps

```dart
main(List<String> args) {
  //Numbers
  int x = 100;
  double y = 1.1;
  int z = int.parse('10');
  double d = double.parse('44.4');
 
  //Strings
  String s = 'This is a string';
  String backslash = 'I can\'t speak';
  //类似JavaScript ，字符串插值
  String interpolated = 'x的值是 $x';    //打印: Value of x is 100
  String interpolated2 = 's的值是 is ${s.toLowerCase()}';    //打印: s的值是string
  
  //Booleans
  bool isDoorOpen = false;
}
```
### Lists 

声明一个list非常的简单，可以简单使用方括号[]定义list。下面是list的常用操作。

```dart
main(List<String> args) {
  var list = [1,2,3,4];
 
  print(list); //输出: [1, 2, 3, 4]
  // 长度
  print(list.length);
 
  // 获取单个值
  print(list[1]);    //输出: 2
 
  // 添加值到list
  list.add(10);
 
  // 删除单个值
  list.remove(3);
 
  // 删除指定位置的值
  list.removeAt(0);
}
```

如果你想定义一个编译时常量list，例如，list的内容是不可改变的，可以使用关键字`const`.

```dart
main(List<String> args) {
  var list = const [1,2,3,4];   
}
```

### Maps 

定义map也很简单。可以使用花括号{}定义map。

```dart 
main(List<String> args) {
  var map = {
    'key1': 'value1',
    'key2': 'value2',
    'key3': 'value3'
  };
 
  // 获取值
  print(map['key1']);    //输出: value1
  print(map['test']);    //输出: null
 
  // 添加值
  map['key4'] = 'value4';
  
  //获取长度
  print(map.length);
 
  //检查是否存在
  map.containsKey('value1');
  //获取 entries and values
  var entries = map.entries;
  var values = map.values;
}
```
你也可以使用map构造函数定义map。
```dart
main(List<String> args) {
  var squares = new Map();
  squares[4] = 16;
}
```

如果你想定义编译时常量的map,可以使用`const`关键字。

```dart 
main(List<String> args) {
  var squares = const {    //不能改变当前map的值
    2: 4,
    3: 9,
    4: 16,
    5: 25
  };
}
```
##  函数

dart中的函数和JavaScript中有点类似。你需要定义就是函数的名字、返回值、参数。

```dart
main(List<String> args) {
  var name = fullName('小明', '王');
  print(name);
}
 
String fullName(String firstName, String lastName) {
  return "$firstName $lastName";
}
```
你也可以省略返回值类型，程序同样可以运行。
```dart
main(List<String> args) {
  var name = fullName('小明', '王');
  print(name);
}
 
fullName(String firstName, String lastName) {
  return "$firstName $lastName";
}
```
下面是定义一行函数的方法。
```dart
main(List<String> args) {
  var name = fullName('John', 'Doe');
  print(name);
}
 
fullName(String firstName, String lastName) => "$firstName $lastName";
```

###  命名参数

dart有个叫命名参数的东西。当你调用函数的时候，你必须指定参数的名字。要使用命名参数，可以将函数的参数包括在花括号{}内。
```dart
main(List<String> args) {
  var name = fullName(firstName: 'John', lastName: 'Doe');
  print(name);
}
 
fullName({String firstName, String lastName}) {
  return "$firstName $lastName";
}
```

如果你在调用命名参数的函数时，没有指定参数的名字，程序将崩溃。

###  参数默认值

你可以给函数的命名参数一个默认值。下面的例子给lastName一个默认值。
```dart
main(List<String> args) {
  var name = fullName(firstName: '王');
  print(name);
}
 
fullName({String firstName, String lastName = "小明"}) {
  return "$firstName $lastName";
}
```
###  函数是一等公民

在dart中函数比较灵活，例如，你可以将函数当参数传递给另一个函数。
```dart
main(List<String> args) {
  out(printOutLoud);
}
 
out(void inner(String message)) {
  inner('消来自内部函数');
}
 
printOutLoud(String message) {
  print(message.toUpperCase());
}
```

这里定义一个函数名字为`out`,需要一个函数参数。然后我定义一个名为`printOutLoud`的函数，他所做的就是将字符串以大写的形式打印。

dart 也有匿名函数，所以上面的例子中不用预定一个函数，而是传递一个匿名函数。
```dart
main(List<String> args) {
  out((message) {
    print(message.toUpperCase());
  });
}
 
out(void inner(String message)) {
  inner('消来自内部函数');
}
```

另一个匿名函数的例子。

```dart
main(List<String> args) {
  var list = [1,2,3,4];
 
  list.forEach((item) {
    print(item);
  });
}
```
##  控制流
### If – else

if-else 和其他语言一样比较简单。
```dart
main(List<String> args) {
  var number = 57;
 
  if (number > 100) {
    print('大于 100');
  } else if (number < 100) {
    print('小于 100');
  } else {
    print('Number is 100');
  }
}
```

可以用三元运算符代替if-else
```dart
main(List<String> args) {
  int age = 60;
  String status = age < 50 ? "Still young" : "Old Man";
}
```
### 循环

和其他大多数语言一样，dart也支持各种的循环，而且语法一样。

#### For 循环

典型的for循环。
```dart
main(List<String> args) {
  for (int i = 0; i < 10; i++) {
    print('$i');
  }
}
```
#### While 循环

典型的while循环
```dart
main(List<String> args) {
  int i = 0;
  while(i < 10) {
    print('$i');
    i++;
  }
}
```
#### Do-while 循环

典型的do while循环。
```dart
main(List<String> args) {
  int i = 0;
  do {
    print('$i');
    i++;
  } while (i < 10);
}
```
### Switch
```dart
main(List<String> args) {
  int age = 50;
 
  switch(age) {
    case 10:
      print('太小.');
      break;
    case 20:
    case 30:
      print(‘还是小’!');
      break;
    case 40:
      print(' 开始变老.');
      break;
    case 50:
      print('老了!');
      break;
  }
}
```

## 异常处理

 dart 使用经典的try-catch处理异常，使用关键字throw抛出一个异常。
###  抛出异常

首先，看看如何抛出异常
```dart
main(List<String> args) {
  divide(10, 0);
}
 
divide(int a, int b) {
  if (b == 0) {
    throw new IntegerDivisionByZeroException();
  }
  return a / b;
}
```

当b变量的值为0的时候，抛出一个内置的异常IntegerDivisionByZeroException。

你也可以在异常中携带一个字符串信息。

```dart
main(List<String> args) {
  divide(10, 0);
}
 
divide(int a, int b) {
  if (b == 0) {
    throw new Exception('Divide by zero');
  }
  return a / b;
}
```
### 捕获和处理异常

现在看看重点的捕获和处理异常。

某种类型的异常可以通过on关键字捕获，如下：
```dart
main(List<String> args) {
  try {
    divide(10, 0);
  } on IntegerDivisionByZeroException { // 和Java类似
    print('Division by zero.');
  }
}
 
divide(int a, int b) {
  if (b == 0) {
    throw new IntegerDivisionByZeroException();
  }
  return a / b;
}
```
如果你不知道抛出异常的类型，或者不确定，可以使用catch块处理任意类型的异常。

```dart
main(List<String> args) {
  try {
    divide(10, 0);
  } on IntegerDivisionByZeroException {
    print('Division by zero.');
  } catch (e) {
    print(e);
  }
}
 
divide(int a, int b) {
  if (b == 0) {
    throw new Exception('Some other exception.');
  }
  return a / b;
}
```
### Finally

dart也提供了finally块，即是否发生异常这个块都会执行。
```dart
main(List<String> args) {
  try {
    divide(10, 0);
  } on IntegerDivisionByZeroException {
    print('除数为.');
  } catch (e) {
    print(e);
  } finally {
    print('始终执行');
  }
}
 
divide(int a, int b) {
  if (b == 0) {
    throw new Exception('Some other exception.');
  }
  return a / b;
}
```
## 参考

https://medium.com/@sarusethi987654321/just-enough-dart-for-flutter-e907b80f4ff4
