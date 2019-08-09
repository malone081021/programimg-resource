
main(List<String> args) {
  var number = 42;
  var name = 'Gurleen Sethi';
  var salary = 150300.56;
  var isDoorOpen = true;

//  int number = 42;
//  String name = 'Gurleen Sethi';
//  double salary = 150300.56;
//  bool isDoorOpen = true;

  //Omit explicitly defining data types

//  final int number = 42;
//  const String name = 'Gurleen Sethi';
//
//
//  final salary = 150300.56;
//  const isDoorOpen = true;

  //Numbers
  int x = 100;
  double y = 1.1;
  int z = int.parse('10');
  double d = double.parse('44.4');

  //Strings
  String s = 'This is a string';
  String backslash = 'I can\'t speak';
  //String interpolation
  String interpolated = 'Value of x is $x';    //Prints: Value of x is 100
  String interpolated2 = 'Value of s is ${s.toLowerCase()}';    //Prints: Value of s is this is a string

  //Booleans
 // bool isDoorOpen = false;


}
