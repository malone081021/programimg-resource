
main(List<String> args) {
  var list = [1,2,3,4];

  print(list); //Output: [1, 2, 3, 4]
  //Length 长度
  print(list.length);

  //Selecting single value 获取单个值
  print(list[1]);    //Outout: 2

  //Adding a value 添加值到list
  list.add(10);

  //Removing a single isntance of value 删除单个值
  list.remove(3);

  //Remove at a particular position 删除指定位置的值
  list.removeAt(0);
}


//main(List<String> args) {
//  var list = const [1,2,3,4];
//}

