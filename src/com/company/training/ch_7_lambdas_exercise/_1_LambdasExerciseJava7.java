package com.company.training.ch_7_lambdas_exercise;

import java.util.*;

public class _1_LambdasExerciseJava7 {

    public static void main(String[] args) {

        List<Student> studentList= Arrays.asList(
                new Student("Kane","Walker",5),
                new Student("Joe","Root",7),
                new Student("Virat","Kohli",3),
                new Student("Steve","Smith",4),
                new Student("Rohit","Sharma",9)
                );
        //1. Sort the list by firstName
        //2. print all the student firstName
        //3. print student names whose lastName starting with "S"
        //4. formulate a map of students with firstName as Key and their grade as Value (K,V)

        System.out.println("-------------//1. Sort the list by firstName-------------------");
        Comparator<Student> studentComparator=new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        };
        Collections.sort(studentList,studentComparator);

        System.out.println("-------------//2. print all the student firstName------------------");
        for (Student s:studentList) {
            System.out.println(s.getFirstName());
        }
        System.out.println("-------------//3. print student names whose lastName starting with \"S\"--------------------");
        //we can very well do in more imperative style,but below is best possible oo way until Java 7
        Condition sc=new NameCondition();
        printNamesWithConditionsMet(studentList,sc);

        System.out.println("-------------//4. formulate a map of students with firstName as Key and their grade as Value (K,V)--------------------------");
        Map<String,Integer> studentsMap=new HashMap<>();
        for (Student s:studentList) {
            studentsMap.put(s.getFirstName(),s.getGrade());
        }
        printNamesWithMappedKeyValues(studentsMap);

    }

    private static void printNamesWithMappedKeyValues(Map<String, Integer> studentsMap) {

        for (Map.Entry<String,Integer> entry:studentsMap.entrySet()) {
            System.out.println("Key="+entry.getKey()+"----"+"Value="+entry.getValue());
        }
    }

    private static void printNamesWithConditionsMet(List<Student> students,Condition condition){
        for (Student s:students) {
            if(condition.check(s)){
                System.out.println(s.getFirstName());
            }
        }
    }
    interface Condition{
        boolean check(Student student);
    }
}

class NameCondition implements _1_LambdasExerciseJava7.Condition {

    public NameCondition() {
    }

    @Override
    public boolean check(Student student) {
        return student.getLastName().startsWith("S");
    }
}

