package com.company.training.ch_8_functions_java8_constructs;

import java.util.List;
import java.util.concurrent.Flow;
import java.util.function.Consumer;

public class _6_ConsumerExample {
    public static void main(String[] args) {
        //consumer takes an argument and returns nothing

        Consumer<String> stringConsumer=(s)->{System.out.println(s.toUpperCase());};
        stringConsumer.accept("java11");
        stringConsumer.accept("you know java functional style is becoming easy now!!!");

        //print all Employee names
        System.out.println("--------------//print all Employee names------------------");
        Consumer<Employee> nameConsumer = (e) -> { System.out.println(e.getName()); };
        printNames(EmployeeDatabase.getAllEmployees(),nameConsumer);

        //print hobbies of employees
        System.out.println("---------------//print hobbies of employees-----------------");

        Consumer<Employee> hobbiesConsumer=(e)->{ System.out.println(e.getHobbies()); };
        printNames(EmployeeDatabase.getAllEmployees(),hobbiesConsumer);

        //chaining of consumers c1.andThen(c2)

        Consumer<Employee> employeeConsumer = nameConsumer.andThen(hobbiesConsumer);
        printNames(EmployeeDatabase.getAllEmployees(),employeeConsumer);

    }

    private static void printNames(List<Employee> employeeList, Consumer<Employee> employeeConsumer){

        //use of forEach accepting a consumer as an argument
        employeeList.forEach(employeeConsumer);
    }
}
