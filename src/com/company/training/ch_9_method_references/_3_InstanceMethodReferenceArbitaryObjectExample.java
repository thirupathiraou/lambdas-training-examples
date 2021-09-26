package com.company.training.ch_9_method_references;

import java.util.List;

public class _3_InstanceMethodReferenceArbitaryObjectExample {

    public static void main(String[] args) {

        List<Integer> integerList= List.of(25,6,3,7,8,9,45);

        integerList.stream()
                .map(e->String.valueOf(e))  // transforming Integer to String
                //.map(a->a.toString()) // make sure you see the parameter(e) became target on which you're calling toString method
                .map(String::toString)
                .forEach(System.out::println);
    }
}
