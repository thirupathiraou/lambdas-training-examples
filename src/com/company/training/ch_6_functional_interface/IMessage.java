package com.company.training.ch_6_functional_interface;
//This indicates that this interface meant to be functional interface and target type for lambdas
//however its good practice but not necessary.
@FunctionalInterface
public interface IMessage {

    public void printMessage();
}
