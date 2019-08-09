
import 'dart:async';

main(List<String> args) {
  getAJoke().then((value) {
    print(value);
  })
      .catchError((error) {
    print('Error');
  });
}

Future<String> getAJoke() {
  return new Future<String>(() {
    //Do a long running task. E.g. Network Call.
    //Return the result
    throw new Exception('No joke for you!');
    return "This is a joke";
  });
}
