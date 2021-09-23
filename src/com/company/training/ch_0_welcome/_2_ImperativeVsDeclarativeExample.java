package com.company.training.ch_0_welcome;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _2_ImperativeVsDeclarativeExample {

    public static void main(String[] args) {
        //Remove Duplicate numbers from the list

        List<Integer> numbers= List.of(3,6,1,3,7,6,4,5,4,3,9,1,7,9);

        //Imperative style
        List<Integer> uniqueNumbersList=new ArrayList<>();

        for (Integer number : numbers) {
            if(!uniqueNumbersList.contains(number)){
                uniqueNumbersList.add(number);
            }
        }

        System.out.println("UNIQUE LIST==>"+uniqueNumbersList);

        //Declarative Style
        List<Integer> distinctList = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("UNIQUE LIST==>"+distinctList);

    }
}
