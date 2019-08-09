
import 'dart:async';

main(List<String> args) {
  getAJoke().then((value) {
    print(value);
  })
      .catchError((error) {
    print('Error');
  });
  print('Another print statement.');
}

Future<String> getAJoke() {
  return new Future<String>.delayed(new Duration(milliseconds: 2000),() {
    //Do a long running task. E.g. Network Call.
    //Return the result
    return "This is a joke";
  });
}
