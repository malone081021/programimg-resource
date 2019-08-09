
本节主要了解Dart一些高级特性

- 类定义和实例创建
- 构造函数
- 方法
- 继承
- 抽象类
- 泛型
- 异步

## 类

下面是创建一个类和创建类的实例。

```dart
main(List<String> args) {
  Dog d = new Dog();
}
 
class Dog {
 
}
```

现在我们给类添加实例变量和构造函数，添加age和name属性给Dog类。

```dart
main(List<String> args) {
  Dog d = new Dog('Duffy', 2);
  print(d.name);
}
 
class Dog {
  String name;
  int age;
 
  Dog(String name, Stirng age) {
    this.name = name;
    this.age = age;
  }
}
```

Dart提供了更加简单直接的方式定义构造函数，如下：
```dart
main(List<String> args) {
  Dog d = new Dog('Duffy', 2);
  print(d.name);
}
 
class Dog {
  String name;
  int age;
 
  Dog(this.name, this.age);
}
```

如上所示，我们一行就定义了构造函数，其中第一个参数赋值给name属性，第二个参数赋值给age属性。
###  命名构造函数

dart提供了另一种定义函数的方式为：命名构造函数。
```dart
main(List<String> args) {
  Dog d = new Dog.newBorn();
  print(d.name);
}
 
class Dog {
  String name;
  int age;
 
  Dog(this.name, this.age);
 
  Dog.newBorn() {
    name = 'Doggy';
    age = 0;
  }
}
```

如上所示，给构造函数提供了名称，这样做使得不同的构造函数变的更加清晰。

### 继承

你可以使用`extends`关键字继承其他的类。
```dart
main(List<String> args) {
  Pug p = new Pug('Duffy', 5);
  print(p.name);
}
 
class Dog {
  String name;
  int age;
 
  Dog(this.name, this.age);
 
  Dog.newBorn() {
    name = 'Doggy';
    age = 0;
  }
}

class Pug extends Dog {
  Pug(String name, int age): super(name, age);
}
```

Pug 类继承Dog类，通过`super`关键字调用Dog类的构造函数。

你也可以通过this关键字，在冒号之后调用同一个类中的其他构造函数。
```dart
main(List<String> args) {
  Pug p = new Pug.small('Duffy');
  print(p.name);
}
 
class Dog {
  String name;
  int age;
 
  Dog(this.name, this.age);
 
  Dog.newBorn() {
    name = 'Doggy';
    age = 0;
  }
}
 
class Pug extends Dog {
  Pug(String name, int age): super(name, age);
 
  Pug.small(Stirng name): this(name, 1);
 
  Pug.large(Stirng name): this(name, 3);
}
```

如上所示，我们定义了两个命名构造函数，他们只需要dog的名字，然后调用Pug的默认构造函数。
### 方法

在类中定义方法和独立定义方法是一样的。
```dart
main(List<String> args) {
  Dog d = new Dog('Duffy', 10);
  d.bark();
}
 
class Dog {
  String name;
  int age;
 
  Dog(this.name, this.age);
 
  Dog.newBorn() {
    name = 'Doggy';
    age = 0;
  }
 
  bark() {
    print('Bow Wow');
  }
}
```

重写方法一样简单。

```dart
main(List<String> args) {
  Pug p = new Pug.small('Duffy');
  p.bark();
}
 
class Dog {
  String name;
  int age;
 
  Dog(this.name, this.age);
 
  Dog.newBorn() {
    name = 'Doggy';
    age = 0;
  }
 
  bark() {
    print('Bow Wow');
  }
}
 
class Pug extends Dog {
  Pug(String name, int age): super(name, age);
 
  Pug.small(Stirng name): this(name, 1);
 
  Pug.large(Stirng name): this(name, 3);
 
  @override
  bark() {
    print('Meow!');
  }
}
```
 
### Getter and Setters 

默认，获取类中的任何变量都可以直接引用变量的名字。例如，dog.name，可以直接获取或者赋值name的值。但是有时候我们希望自定义属性的getter和setter方法，可以使用get和set关键字自定义getter和setter方法。

```dart
main(List<String> args) {
  Dog d = new Dog('Duffy', 5);
  d.respectedName = 'Mr.Duffy';
  print(d.respectedName);
}
 
class Dog {
  String name;
  int age;
 
  Dog(this.name, this.age);
 
  String get respectedName {
    return 'Mr.$name';
  }
 
  set respectedName(String newName) {
    name = newName;
  }
 
  Dog.newBorn() {
    name = 'Doggy';
    age = 0;
  }
 
  bark() {
    print('Bow Wow');
  }
}
```

现在，你可能在想，name属性是可以访问而且可以被随意修改。来让我处理一下，使name属性私有化。
### 访问控制

默认类中的所有属性和方法是public的。在dart中，可以在属性和方法名前添加“_”使私有化。现在让我们使name属性私有化。

```dart
main(List<String> args) {
  Dog d = new Dog('Duffy', 5);
  print(d.name);  //This will throw error
}
 
class Dog {
  String _name;
  int age;
 
  Dog(this.name, this.age);
 
  String get respectedName {
    return 'Mr.$name';
  }
 
  set respectedName(String newName) {
    name = newName;
  }
 
  Dog.newBorn() {
    name = 'Doggy';
    age = 0;
  }
 
  bark() {
    print('Bow Wow');
  }
 
  _hiddenMethod() {
    print('I can only be called internally!');
  }
}
```
###  抽象类和方法

你可以通过`abstract`关键字声明抽象类
```dart
abstract class AbstractDog {
  void bark();
 
  void _hiddenMethod();
}
```

你只需要在类声明前添加`abstract`关键字，方法不需要。方法只需要签名，不需要实现。
###  静态方法

如果想让方法或者属性静态化，只需要在声明前添加`static`关键字。
```dart
main(List<String> args) {
  Dog.bark(); 
}
 
class Dog {
  String name;
  int age;
 
  Dog(this.name, this.age);
 
  static bark() {
    print('Bow Wow');
  }
}
```
###  枚举

dart 支持枚举，用法和java一样。

```dart
main(List<String> args) {
  Dog d = new Dog('Duffy', 12, CurrentState.sleeping);
  print(d.state == CurrentState.sleeping); //Prints 'true'
}
 
enum CurrentState {
  sleeping,
  barking,
  eating,
  walking
}
 
class Dog {
  String name;
  int age;
  CurrentState state;
 
  Dog(this.name, this.age, this.state);
 
  static bark() {
    print('Bow Wow');
  }
}
```

##   泛型

dart全面支持泛型。假设你想在你定义的类中，想持有任意类型的数据。如下是怎样使用泛型定义这样的类。
```dart
main(List<String> args) {
  DataHolder<String> dataHolder = new DataHolder('Some data');
  print(dataHolder.getData());
  dataHolder.setData('New Data');
  print(dataHolder.getData());
}
 
class DataHolder<T> {
  T data;
 
  DataHolder(this.data);
 
  getData() {
    return data;
  }
 
  setData(data) {
    this.data = data;
  }
}
```
## Future 

async 库中有一个叫Future的东西。Future是基于观察者模式的。如果你熟悉Rx或者JavaScript的Promises，你就明白了。

简单说，一个Future定义一个未来要发生的事，例如，将来一个值返回给我们。来让我们看看Future实际怎么用。

Future是支持泛型的，例如Future<T>,通过T指定将来返回值的类型。

```dart
import 'dart:async';
 
main(List<String> args) {
  getAJoke().then((value) {
    print(value);
  })
  .catchError((error) {
    print('Error');
  });
}
 // 代码的阅读更加的方便
Future<String> getAJoke() {
  return new Future<String>(() {
    // 做一个耗时的工作，例如 网络请求
    // 返回数据
    return "This is a joke";
  });
}
```

我们定义了一个叫`getAJoke`的函数，返回值为`Future<String>`.你可以通过`new`关键字创建一个Future。Future的构造函数，需要一个函数作为参数，这个函数返回`T`类型的数据。在匿名函数中的返回值就是Future的返回值。

在main函数中，我们调用了`getAJoke`方法，他返回`Future<String>`.我们通过调用`then`方法订阅Future，在`then`中注册回调函数，当Future返回值时调用注册函数。同时注册了`catchError`方法处理在Future执行之间发生的异常。在上面的例子中不会发生异常。

下面的例子是会发生异常的例子。
```dart
import 'dart:async';
 
main(List<String> args) {
  getAJoke().then((value) {
    print(value);
  })
  .catchError((error) {
    print('Error');
  });
}
 
Future<String> getAJoke() {
  return new Future<String>(() {
    throw new Exception('No joke for you!');
    return "This is a joke";
  });
}
```

现在我们的例子都是会立即返回的，但是在生产环境中都是一些耗时的操作，例如，网络调用，我们可以使用`Future.delayed()`模仿
```dart
import 'dart:async';
 
main(List<String> args) {
  getAJoke().then((value) {
    print(value);
  })
  .catchError((error) {
    print('Error');
  });
}
 
Future<String> getAJoke() {
  return new Future<String>.delayed(new Duration(milliseconds: 2000),() {
    //Do a long running task. E.g. Network Call.
    //Return the result
    return "This is a joke";
  });
}
```

现在如果你运行，你将需要2秒，才能返回结果。现在看另一个例子。
```dart
import 'dart:async';
 
main(List<String> args) {
  getAJoke().then((value) {
    print(value);
  })
  .catchError((error) {
    print('Error');
  });
  print('Another print statement.');
}
 
// 模拟实际的状况
Future<String> getAJoke() {
  return new Future<String>.delayed(new Duration(milliseconds: 2000),() {
     // 做一个耗时的工作，例如 网络请求
     // 返回数据
    return "This is a joke";
  });
}
```

如上所示，在调用函数之后，我们添加了print语句。在这种场景中，print语句会先执行，之后future的返回值才会打印。这是future的预期行为.但是如果我们希望在执行其他语句之前，先执行future。所以我们需要用到`async/await`.


### Async/Await

```dart
import 'dart:async';
 
main(List<String> args) async {
  try {
    String result = await getAJoke();
    print(result);
  } catch(e) {
    print(e);
  }
  print('Another print statement.');
}
 
Future<String> getAJoke() {
  return new Future<String>.delayed(new Duration(milliseconds: 2000),() {
    //Do a long running task. E.g. Network Call.
    //Return the result
    return "This is a joke";
  });
}
```

如上所示，我们在main函数的花括号开始添加`async`关键字。我们添加`await`关键字在调用`getAJoke`方法之前，他所做的就是在future返回值之后，继续往下执行。我们将整个代码包裹在try-catch中，我们想捕获所有的异常，和之前使用catchError回调是一样。使用`awiat`关键字，必须给函数添加`async`关键字，否则没有效果。

## 参考
https://medium.com/@sarusethi987654321/just-enough-dart-for-flutter-e907b80f4ff4