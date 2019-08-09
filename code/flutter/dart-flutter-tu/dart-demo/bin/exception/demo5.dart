main(List<String> args) {
  try {
    divide(10, 0);
  } on IntegerDivisionByZeroException {
    print('Division by zero.');
  } catch (e) {
    print(e);
  } finally {
    print('I will always be executed!');
  }
}

divide(int a, int b) {
  if (b == 0) {
    throw new Exception('Some other exception.');
  }
  return a / b;
}
