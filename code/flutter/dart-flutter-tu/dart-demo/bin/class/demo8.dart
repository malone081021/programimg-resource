// 自定义getter 和 setter方法

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

