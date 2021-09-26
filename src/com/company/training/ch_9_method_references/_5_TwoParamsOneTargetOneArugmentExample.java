package com.company.training.ch_9_method_references;

import java.util.List;

public class _5_TwoParamsOneTargetOneArugmentExample {
    public static void main(String[] args) {
        List<Integer> integerList= List.of(25,6,3,7,8,9,45);

        System.out.println(integerList.stream()
                .map(String::valueOf)
                //.reduce("",(carry,a)->carry.concat(a))  //// the order of parameters should be same
                .reduce("",String::concat));
    }
}
