main(List<String> args) {
  int age = 50;

  switch(age) {
    case 10:
      print('Too Young.');
      break;
    case 20:
    case 30:
      print('Still Young!');
      break;
    case 40:
      print('Getting old.');
      break;
    case 50:
      print('You are old!');
      break;
  }
}
