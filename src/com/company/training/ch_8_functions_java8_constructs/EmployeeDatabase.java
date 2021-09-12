package com.company.training.ch_8_functions_java8_constructs;

import java.util.Arrays;
import java.util.List;

public class EmployeeDatabase {


    public static List<Employee> getAllEmployees(){

        Employee e1=new Employee("Emily",GRADELEVEL.THREE,GENDER.FEMALE,List.of("Swimming","Baseball"),5.9);
        Employee e2=new Employee("Andy",GRADELEVEL.TWO,GENDER.MALE,List.of("Cricket","Baseball"),3.2);
        Employee e3=new Employee("Dave",GRADELEVEL.FIVE,GENDER.MALE,List.of("Football","Basketball","Baseball"),10);
        Employee e4=new Employee("James",GRADELEVEL.FOUR,GENDER.MALE,List.of("Volleyball","Baseball","Cricket"),9);
        Employee e5=new Employee("Jenny",GRADELEVEL.FIVE,GENDER.FEMALE,List.of("Swimming","Football","Baseball"),8.5);

        List<Employee> employeeList= List.of(e1,e2,e3,e4,e5);

        return employeeList;
    }
}
