package com.company.training.ch_8_functions_java8_constructs;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class _9_FunctionExample {
    public static void main(String[] args) {

        //Print all Employee Names in CAPITAL LETTERS

        Function<String,String> upperCaseNameFunction=(s1)->{return s1.toUpperCase();};
        printNames(EmployeeDatabase.getAllEmployees(),upperCaseNameFunction);

    }

    private static void printNames(List<Employee> employeeList, Function<String,String> nameFunction){

        for (Employee employee : employeeList) {
            System.out.println(nameFunction.apply(employee.getName()));
        }
    }
}
