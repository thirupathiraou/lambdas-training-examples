package com.company.training.ch_8_functions_java8_constructs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Employee {

    private String name;
    private GRADELEVEL gradeLevel; // 1,2,3,4,5
    private GENDER gender;
    List<String> hobbies = new ArrayList<>();
    private double experience; //years of experience

    private Optional<Object> award= Optional.empty();


    public Employee(String name, GRADELEVEL gradeLevel, GENDER gender, List<String> hobbies, double experience) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gender = gender;
        this.hobbies = hobbies;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GRADELEVEL getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(GRADELEVEL gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public Optional<Object> getAward() {
        return award;
    }

    public void setAward(Optional<Object> award) {
        this.award = award;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", gender=" + gender +
                ", hobbies=" + hobbies +
                ", experience=" + experience +
                ", award=" + award +
                '}';
    }
}
