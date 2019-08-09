
// 无返回值得函数
main(List<String> args) {
  var name = fullName('John', 'Doe');
  print(name);
}

fullName(String firstName, String lastName) {
  return "$firstName $lastName";
}