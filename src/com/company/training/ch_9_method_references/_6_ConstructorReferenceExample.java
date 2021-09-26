package com.company.training.ch_9_method_references;

public class _6_ConstructorReferenceExample {

    public static void main(String[] args) {
        //Observe that Person class didn't implement any of the interfaces - PersonWithName,PersonEmptyName

        System.out.println("Example of empty constructor reference example");

        PersonEmptyName p1=Person::new;
        System.out.println(p1.getPerson()); //return null as there is no name initialized in no-arg constructor
        //toString method of Person class helps us to see the null assigned for name variable in Person class

        PersonWithName p2=Person::new;
        System.out.println(p2.getPerson("Ram"));

    }


}
