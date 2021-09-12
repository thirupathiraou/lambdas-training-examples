package com.company.training.ch_8_functions_java8_constructs;

public enum GRADELEVEL {
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5");

    private String value;

    private GRADELEVEL(String s) {
        this.value=s;
    }

    public String getValue(){
        return this.value;
    }

}
