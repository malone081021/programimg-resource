main(List<String> args) {
  divide(10, 0);
}

divide(int a, int b) {
  if (b == 0) {
    throw new Exception('Divide by zero');
  }
  return a / b;
}
