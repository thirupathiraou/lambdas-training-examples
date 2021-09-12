package com.company.training.ch_8_functions_java8_constructs;

import java.nio.charset.IllegalCharsetNameException;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _3_BiPredicateExample {

    public static void main(String[] args) {

        //simple exercise
        BiPredicate<Integer,Integer> isDivisiblePredicate=(a, b)->{return (a%b==0);};

        System.out.println("20 is divisible by 5="+isDivisiblePredicate.test(20,5));
        System.out.println("120 is divisible by 3="+isDivisiblePredicate.test(120,3));
        System.out.println("90 is divisible by 11="+isDivisiblePredicate.test(90,11));


        //compound operation on BiPredicate
        System.out.println("-----------//compound operation on BiPredicate-------------------");

        //Negate operation on BiPredicate
        System.out.println("-------------//Negate operation on BiPredicate-----------------");
        System.out.println("90 is divisible by 11="+isDivisiblePredicate.negate().test(90,11));

        //print all MALE Employee Names  and having "football" as hobby
        System.out.println("------------//print all MALE Employee Names  and having \"football\" as hobby---------------------");

        BiPredicate<Employee,List<String>> biPredicate=(e,h)->{return (e.getGender()==GENDER.MALE && h.contains("Football"));};
        printEmployeeNames(EmployeeDatabase.getAllEmployees(),biPredicate);

    }

    private static void printEmployeeNames(List<Employee> employeeList, BiPredicate<Employee,List<String>> condition){

        for (Employee e:employeeList) {
            if (condition.test(e,e.getHobbies())){
                System.out.println(e);
            }

        }
    }

}
