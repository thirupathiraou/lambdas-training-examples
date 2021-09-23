package com.company.training.ch_8_functions_java8_constructs;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _7_BiConsumerExample {

    public static void main(String[] args) {
            //Biconsumer takes two arguments and returns nothing

            BiConsumer<Integer,Integer> addConsumer=(a,b)->{  System.out.println(a+b);  };
            addConsumer.accept(10,15);

            //print all Employee names
            System.out.println("--------------//print all Employee names ==> their hobbies------------------");

            BiConsumer<String, List<String>> employeeListBiConsumer=(e,h)->{
                System.out.println(e+"====>"+h);
            };


            printNames(EmployeeDatabase.getAllEmployees(),employeeListBiConsumer);
        }

        private static void printNames(List<Employee> employeeList, BiConsumer<String,List<String>> biConsumer){

            //use of forEach accepting a consumer as an argument
            for (Employee employee : employeeList) {
                biConsumer.accept(employee.getName(),employee.getHobbies());
            }
        }

    }
