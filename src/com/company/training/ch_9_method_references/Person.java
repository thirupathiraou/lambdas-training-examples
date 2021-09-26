package com.company.training.ch_9_method_references;

import java.util.Objects;

public class Person {

    private String name;

    public Person() {
        System.out.println("debug---no arg constructor fired");
    }

    public Person(String name) {
        System.out.println("debug---one arg constructor fired, with--"+name);

        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
