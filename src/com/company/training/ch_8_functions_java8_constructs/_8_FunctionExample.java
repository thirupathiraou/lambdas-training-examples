package com.company.training.ch_8_functions_java8_constructs;

import java.util.function.Function;

public class _8_FunctionExample {
    public static void main(String[] args) {

        Function<String,String> upperCaseFunction=(s1)->{return s1.toUpperCase();};

        System.out.println("Example use upper function--"+upperCaseFunction.apply("helloworld"));

        Function<Integer,Integer> incrementBy75Function=(a)->{return a+75;};

        System.out.println("Example use incrementBy75Function--"+incrementBy75Function.apply(10));
    }
}
