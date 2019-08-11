package com.malone.hello.function;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * BiFunction 不存在compose方法，因为BiFunction只能返回一个结果，所以BiFunction不能compose，组合方法
 */
public class FunctionTest2 {

    public static void main(String[] args) {
        FunctionTest2 test = new FunctionTest2();

        System.out.println(test.compute(2,value -> value *3,value -> value * value)); // 12
        System.out.println(test.compute2(2,value -> value *3,value -> value * value)); // 36

        System.out.println(test.compute3(1,2,(value1,value2) ->  value1 + value2)); //
        System.out.println(test.compute3(1,2,(value1,value2) ->  value1 - value2)); //
        System.out.println(test.compute3(1,2,(value1,value2) ->  value1 * value2)); //
        System.out.println(test.compute3(1,2,(value1,value2) ->  value1 / value2)); //

        System.out.println(test.compute4(2,3,(value1,value2) ->  value1 + value2,value -> value * value)); //

    }

    /**
     *  重点compose演示
     *  既之后，先应用当前函数，在应用外部函数
     * @param a
     * @param function1
     * @param function2
     * @return
     */
    public int compute (int a, Function<Integer,Integer> function1, Function<Integer,Integer> function2){
        return function1.compose(function2).apply(a);
    }

    /**
     *  重点是andThen
     * @param a
     * @param function1
     * @param function2
     * @return
     */
    public int compute2 (int a, Function<Integer,Integer> function1, Function<Integer,Integer> function2){
        return function1.andThen(function2).apply(a);
    }

    /**
     * BiFunction
     * @param a
     * @param b
     * @param biFunction
     * @return
     */
    public int compute3(int a, int b, BiFunction<Integer,Integer,Integer> biFunction) {
        return biFunction.apply(a,b);
    }

    /**
     *  先应用biFunction，再应用function
     * @param a
     * @param b
     * @param biFunction
     * @param function
     * @return
     */
    public int compute4(int a, int b, BiFunction<Integer,Integer,Integer> biFunction,Function<Integer,Integer> function) {
        // 先应用biFunction，再应用function
        // biFunction 没有compose方法
        return biFunction.andThen(function).apply(a,b);
    }

}
