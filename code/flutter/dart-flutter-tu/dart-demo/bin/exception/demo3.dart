main(List<String> args) {
  try {
    divide(10, 0);
  } on IntegerDivisionByZeroException {
    print('Division by zero.');
  }
}

divide(int a, int b) {
  if (b == 0) {
    throw new IntegerDivisionByZeroException();
  }
  return a / b;
}
