package com.company.training.ch_9_method_references;


import java.util.List;

public class _1_InstanceMethodReferenceParticularObjectExample {

    public static void main(String[] args) {


        List<Integer> integerList= List.of(25,6,3,7,8,9,45);

        integerList.forEach(a->{ System.out.println(a);  });

        System.out.println("Using Instance Method Reference Particular Object");

        integerList.forEach(System.out::println);
    }
}
