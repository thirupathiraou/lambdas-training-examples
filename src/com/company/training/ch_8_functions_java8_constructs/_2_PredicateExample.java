package com.company.training.ch_8_functions_java8_constructs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class _2_PredicateExample {

    public static void main(String[] args) {

        //simple exercise

        Predicate<Integer> isEvenPredicate=(a)->{return a%2==0;};
        Predicate<Integer> isMultipleOfFive = (b)->{return b%5==0;};

        System.out.println("20 is Even="+isEvenPredicate.test(20));
        System.out.println("23 is Even="+isEvenPredicate.test(23));
        System.out.println("45 is Multiple of Five="+isMultipleOfFive.test(45));
        System.out.println("54 is Multiple of Five="+isMultipleOfFive.test(54));

        //compound operation on Predicate
        System.out.println("-----------//compound operation on Predicate-------------------");
        System.out.println("54 is Even AND Multiple of Five="+isEvenPredicate.and(isMultipleOfFive).test(54));
        System.out.println("10 is Even AND Multiple of Five="+isEvenPredicate.and(isMultipleOfFive).test(10));
        System.out.println("54 is Even OR Multiple of Five="+isEvenPredicate.or(isMultipleOfFive).test(54));
        System.out.println("13 is Even OR Multiple of Five="+isEvenPredicate.or(isMultipleOfFive).test(13));

        //Negate operation on Predicate
        System.out.println("-------------//Negate operation on Predicate-----------------");
        System.out.println("20 is Even="+isEvenPredicate.negate().test(20));
        System.out.println("54 is Even AND Multiple of Five="+isEvenPredicate.and(isMultipleOfFive).negate().test(54));

        //print all Employee Names whose GRADELEVEL is FIVE
        System.out.println("------------//print all Employee Names whose GRADELEVEL is FIVE---------------------");

        Predicate<Employee> gradeLevelPredicate=(employee) -> {return employee.getGradeLevel() == GRADELEVEL.FIVE; };
        printEmployeeNames(EmployeeDatabase.getAllEmployees(),gradeLevelPredicate);

        //print all MALE Employee Names
        System.out.println("--------------//print all MALE Employee Names--------------------------------");
        printEmployeeNames(EmployeeDatabase.getAllEmployees(),e->e.getGender()==GENDER.MALE);

    }

    private static void printEmployeeNames(List<Employee> employeeList,Predicate<Employee> condition){

        for (Employee e:employeeList) {
            if (condition.test(e)){
                System.out.println(e);
            }

        }
    }
}
