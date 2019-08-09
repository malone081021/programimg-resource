// 定义方法

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

