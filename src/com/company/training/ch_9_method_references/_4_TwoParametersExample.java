package com.company.training.ch_9_method_references;

import java.util.List;

public class _4_TwoParametersExample {

    public static void main(String[] args) {
        List<Integer> integerList= List.of(25,6,3,7,8,9,45);


        System.out.println(
                integerList.stream()
                        //.reduce(0,(total,e) -> Integer.sum(total,e)) // the order of parameters should be same
                        .reduce(0,Integer::sum)
        );

    }
}
