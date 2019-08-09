main(List<String> args) {
  var map = {
    'key1': 'value1',
    'key2': 'value2',
    'key3': 'value3'
  };

  //Fetching the values 获取值
  print(map['key1']);    //Output: value1
  print(map['test']);    //Output: null

  //Add a new value 添加值
  map['key4'] = 'value4';

  //Length   获取长度
  print(map.length);

  //Check if a key is present 检查是否存在
  map.containsKey('value1');

  //Get entries and values
  var entries = map.entries;
  var values = map.values;

  // 利用map 构造函数创建map
  var squares = new Map();
  squares[4] = 16;

  // 如果你想定义编译时常量的map,可以使用const关键字。
  var squares2 = const {    //不能改变当前map的值
    2: 4,
    3: 9,
    4: 16,
    5: 25
  };


}

