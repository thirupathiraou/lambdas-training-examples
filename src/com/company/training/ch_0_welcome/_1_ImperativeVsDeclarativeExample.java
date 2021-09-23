package com.company.training.ch_0_welcome;

import java.util.stream.IntStream;

public class _1_ImperativeVsDeclarativeExample {
    public static void main(String[] args) {
        //sum of 0 to 100 integers

        //Imperative style
        int sum=0;
        for (int i = 0; i <= 100; i++) {
            sum=sum+i;
        }
        System.out.println("SUM OF 0 to 100 ==>"+sum);


        int totalSum = IntStream.rangeClosed(0, 100)
                .sum();
        System.out.println("SUM OF 0 to 100 ==>"+totalSum);

    }
}
