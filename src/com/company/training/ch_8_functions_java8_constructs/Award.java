package com.company.training.ch_8_functions_java8_constructs;

import java.util.Objects;

public class Award {
    private String name;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Award{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Award award = (Award) o;
        return year == award.year &&
                Objects.equals(name, award.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }
}
