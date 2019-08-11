package com.malone.hello.function;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 从函数式接口道lamda
 * write less,do more
 */
public class PredicateTest2 {

    public static void main(String[] args) {
    /**
     * 需求
     * 找到偶数、基数、大于5 大于6 等等
     * 传递行为不是传递值
     */
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,8,9,10);

        PredicateTest2 test = new PredicateTest2();
        test.conditionFilter(list,item -> item % 2 == 0);
        System.out.println("=============================");
        test.conditionFilter(list,item -> item % 2 != 0);
        System.out.println("=============================");
        test.conditionFilter(list,item -> item > 5);
        System.out.println("=============================");
        test.conditionFilter(list,item -> item < 3);
        System.out.println("=============================");
        test.conditionFilter(list,item -> true);
        System.out.println("=============================");
        test.conditionFilter(list,item -> false);

        System.out.println("=============================");
        test.conditionFilter2(list,item -> item % 2 == 0,item -> item > 5);


       System.out.println( test.isEqual("test").test("test"));

    }

    /**
     * 抽象能力更高,方法也更加的泛化;apply、test
     * 函数式接口，从类中抽象出去了，
     * 成了更抽象的函数式接口，
     * 接口实现，通过参数，传递给方法
     * 调用者提供函数式方法的实现
     * @param list 数据
     * @param predicate 行为
     */
    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate){
        for (Integer integer:list){
            if (predicate.test(integer)){
                System.out.println(integer);
            }
        }
    }

    public void conditionFilter2(List<Integer> list, Predicate<Integer> predicate1,Predicate<Integer> predicate2){
        for (Integer integer:list){
            if (predicate1.and(predicate2).negate().test(integer)){
                System.out.println(integer);
            }
        }
    }

    public Predicate<String> isEqual(String test) {
        return Predicate.isEqual(test);
    }
}
