package com.company.training.ch_0_welcome;

import java.util.List;
import java.util.stream.Collectors;

public class _3_ImperativeVsDeclarativeExample {

    public static void main(String[] args) {
        List<Integer> integerList= List.of(1,2,3,4,5,6,7,8,9,10);

        //given the values,double the even numbers and find out the total sum of them

        //Imperative style
        int result=0;
        for (int e:integerList)
        {
            if (e%2==0)
            {
                result += e*2;
            }
        }

        System.out.println("Imperative style Result="+result);

        //functional composition
        //In Maths , y= g(f(x))

        int sum = integerList.stream()
                .filter((a) -> { return a % 2 == 0;})
                .mapToInt((a) -> { return a * 2; })
                .sum();
        System.out.println("Functional style Result="+sum);
    }
}
