
// 访问控制

main(List<String> args) {
  Dog d = new Dog('Duffy', 5);
  print(d._name);  //This will throw error
}

class Dog {
  String _name;
  int age;

  Dog(this._name, this.age);

  String get respectedName {
    return 'Mr.$_name';
  }

  set respectedName(String newName) {
    _name = newName;
  }

  Dog.newBorn() {
    _name = 'Doggy';
    age = 0;
  }

  bark() {
    print('Bow Wow');
  }

  _hiddenMethod() {
    print('I can only be called internally!');
  }
}

