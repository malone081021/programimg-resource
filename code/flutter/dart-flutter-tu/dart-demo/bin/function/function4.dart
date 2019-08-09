
// 函数中的命名参数
main(List<String> args) {
  var name = fullName(firstName: 'John', lastName: 'Doe');
  print(name);
}

fullName({String firstName, String lastName}) {
  return "$firstName $lastName";
}