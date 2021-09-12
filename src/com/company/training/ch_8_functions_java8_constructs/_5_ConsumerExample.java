package com.company.training.ch_8_functions_java8_constructs;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class _5_ConsumerExample {

    public static void main(String[] args) {
        {
            List<Student> studentList= Arrays.asList(
                    new Student("Kane","Walker",5),
                    new Student("Joe","Root",7),
                    new Student("Virat","Kohli",3),
                    new Student("Steve","Smith",4),
                    new Student("Rohit","Sharma",9)
            );

            //1. print all the student firstName
            //2. Sort the list by firstName
            //3. print student names whose lastName starting with "S"
            //4. formulate a map of students with firstName as Key and their grade as Value (K,V)

            System.out.println("-------------//1. Sort the list by firstName-------------------");
            //use of Lambda expressions
            Collections.sort(studentList,(s1, s2)->{return s1.getFirstName().compareTo(s2.getFirstName());});

            System.out.println("-------------//2. print all the student firstName------------------");
            printNamesWithConditionsMet(studentList,student -> {return true;},s->{ System.out.println(s); });

            System.out.println("-------------//3. print student names whose lastName starting with \"S\"--------------------");

            printNamesWithConditionsMet(studentList,student -> {return student.getLastName().startsWith("S");},s->{ System.out.println(s); });

            System.out.println("-------------//4. formulate a map of students with firstName as Key and their grade as Value (K,V)--------------------------");
            Map<String,Integer> studentsMap=new HashMap<>();
            for (Student s:studentList) {
                studentsMap.put(s.getFirstName(),s.getGrade());
            }
            printNamesWithMappedKeyValues(studentsMap);
        }

    }
    private static void printNamesWithMappedKeyValues(Map<String, Integer> studentsMap) {

        for (Map.Entry<String,Integer> entry:studentsMap.entrySet()) {
            System.out.println("Key="+entry.getKey()+"----"+"Value="+entry.getValue());
        }
    }

    //using Predicate and Consumer,which is out of the box functional interface
    private static void printNamesWithConditionsMet(List<Student> students, Predicate<Student> predicate, Consumer<Student> consumer){
        for (Student s:students) {
            if(predicate.test(s)){
                consumer.accept(s);
            }
        }
    }
}
