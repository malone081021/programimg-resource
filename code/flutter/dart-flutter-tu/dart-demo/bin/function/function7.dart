// 匿名函数
main(List<String> args) {
  out((message) {
    print(message.toUpperCase());
  });
}

out(void inner(String message)) {
  inner('Message from inner function');
}
