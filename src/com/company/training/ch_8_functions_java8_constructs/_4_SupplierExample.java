package com.company.training.ch_8_functions_java8_constructs;

import java.util.List;
import java.util.function.Supplier;

public class _4_SupplierExample {
    public static void main(String[] args) {
        Supplier<Employee> employeeSupplier=()->{
            return new Employee("Emily",GRADELEVEL.THREE,GENDER.FEMALE, List.of("Swimming","Baseball"),5.9);
        };

        System.out.println(employeeSupplier.get());
    }
}
