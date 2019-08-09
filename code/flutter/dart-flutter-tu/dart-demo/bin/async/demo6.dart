
import 'dart:async';

main(List<String> args) async {
  try {
    String result = await getAJoke();
    print(result);
  } catch(e) {
    print(e);
  }
  print('Another print statement.');
}

Future<String> getAJoke() {
  return new Future<String>.delayed(new Duration(milliseconds: 2000),() {
    //Do a long running task. E.g. Network Call.
    //Return the result
    return "This is a joke";
  });
}

