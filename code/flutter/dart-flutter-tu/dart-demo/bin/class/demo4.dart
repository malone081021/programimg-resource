// 继承
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
