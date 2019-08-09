
// 函数作为参数
main(List<String> args) {
  out(printOutLoud);
}

out(void inner(String message)) {
  inner('Message from inner function');
}

printOutLoud(String message) {
  print(message.toUpperCase());
}
