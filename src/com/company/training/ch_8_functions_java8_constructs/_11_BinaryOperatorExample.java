package com.company.training.ch_8_functions_java8_constructs;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class _11_BinaryOperatorExample {
    public static void main(String[] args) {
        //BinaryOperator is special case of BiFunction
        //takes 2 inputs of same type,returns same type of input

        Comparator<Integer> numberComparator=(a1,a2)->{return a1.compareTo(a2);};

        BinaryOperator<Integer> integerBinaryOperator = BinaryOperator.maxBy(numberComparator);
        System.out.println(integerBinaryOperator.apply(10,89));
    }
}
