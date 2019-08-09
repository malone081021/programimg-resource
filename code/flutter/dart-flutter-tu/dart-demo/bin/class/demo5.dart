// this  访问其他的构造函数
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

  Pug.small(String name): this(name, 1);

  Pug.large(String name): this(name, 3);
}
