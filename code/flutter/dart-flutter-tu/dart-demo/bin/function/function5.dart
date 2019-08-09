
// 参数默认值
main(List<String> args) {
  var name = fullName(firstName: 'John');
  print(name);
}

fullName({String firstName, String lastName = "Lazy"}) {
  return "$firstName $lastName";
}