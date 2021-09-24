package com.company.training.ch_8_functions_java8_constructs;

import java.util.function.UnaryOperator;

public class _12_UnaryOperatorExample {
    public static void main(String[] args) {
        // UnaryOperator is very similar to Function<T,R>
        //but only difference is input and output types are same.

        UnaryOperator<String> stringUnaryOperator=(s)->{return s.toUpperCase();};

        System.out.println(stringUnaryOperator.apply("hello"));;

    }
}
