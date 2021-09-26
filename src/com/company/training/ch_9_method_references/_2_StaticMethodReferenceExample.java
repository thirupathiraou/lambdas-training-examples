package com.company.training.ch_9_method_references;

import java.util.List;

public class _2_StaticMethodReferenceExample {

    public static void main(String[] args) {
        List<Integer> integerList= List.of(25,6,3,7,8,9,45);


        integerList.stream()
                .filter(a->a%2==0)
                //.map(a->String.valueOf(a))  //can be translated as Static method reference below line
                .map(String::valueOf)
                .forEach(System.out::println);
    }
}
