// 重写方法

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

  Pug.small(String name): this(name, 1);

  Pug.large(String name): this(name, 3);

  @override
  bark() {
    print('Meow!');
  }
}

