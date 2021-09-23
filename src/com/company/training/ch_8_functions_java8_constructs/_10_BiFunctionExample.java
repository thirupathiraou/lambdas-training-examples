package com.company.training.ch_8_functions_java8_constructs;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _10_BiFunctionExample {
    public static void main(String[] args) {
        //Print employee details like NAME(GENDER)

        //BiFunction<T,U,R> - takes two inputs and returns Result

        BiFunction<String,String,String> formaterFunction=(s1,s2)->{return new StringBuilder(s1.toUpperCase()).append("(").append(s2.toUpperCase()).append(")").toString();};

        printNames(EmployeeDatabase.getAllEmployees(),formaterFunction);
    }

    private static void printNames(List<Employee> employeeList, BiFunction<String,String,String> nameFunction){

        for (Employee employee : employeeList) {
            System.out.println(nameFunction.apply(employee.getName(),employee.getGender().toString()));
        }
    }
}
