package com.company.training.ch_8_functions_java8_constructs;

import java.util.List;
import java.util.function.Consumer;

public class _13_CollectionsImplicitIteratorsExample {

    public static void main(String[] args) {
        List<Integer> integerList= List.of(1,2,3,4,5,6,7,8,9,10);
        //Explicit iterators

        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }
        System.out.println("FOR EACH LOOP VERSION");

        for (Integer number : integerList) {
            System.out.println(number);
        }


        //Implicit Iterators

        integerList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("lambdas usage....");

        //using lambdas instead of anonymous
        integerList.forEach(a-> System.out.println(a));

        //Lambdas are really cute, Keep them that way.
        // we need to make sure to have just 1/2 lines.

    }
}
