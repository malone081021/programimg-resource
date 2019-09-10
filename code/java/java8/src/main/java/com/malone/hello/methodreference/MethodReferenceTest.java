package com.malone.hello.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 *  方法引用用法
 *   1. 类名::静态方法名
 *   2.引用名(对象名)::实例方法名称
 *   3. 类::实例方法名称
 *   4  构造方法引用：类型::new
 */
public class MethodReferenceTest {


    public String getString2(String str, Function<String,String> function) {
        return function.apply(str);
    }
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",10);
        Student student2 = new Student("lisi",90);
        Student student3 = new Student("wangwu",50);
        Student student4 = new Student("zhaoliu",40);
        List<Student> students = Arrays.asList(student1,student2,student3,student4);

        // 等价的lamada写法
        students.sort((studentParam1,studentParam2) -> Student.compareByName(studentParam1,studentParam2));

        System.out.println("========================================");

        // 方法引用
        students.sort(Student::compareByScore);


        // 引用::方法名称
        StudentComparator comparator = new StudentComparator();

        students.sort(comparator::compareByName);


        //  3. 类::实例方法名称,第一个参数是调用者，其他是方法的参数
        students.sort(Student::compareByName1);


        // 4  构造方法引用：类型::new
        MethodReferenceTest test = new MethodReferenceTest();
        System.out.println(test.getString2("hello",String::new));
    }
}
