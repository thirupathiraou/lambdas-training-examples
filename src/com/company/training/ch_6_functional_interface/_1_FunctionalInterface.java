package com.company.training.ch_6_functional_interface;

import com.company.training.ch_5_lambdas_runnable._1_RunnableLambdas;

public class _1_FunctionalInterface {

    public void greet(IMessage msg)
    {
        msg.printMessage();
    }

    public static void main(String[] args) {
        System.out.println("------------starting execution---------"+ _1_FunctionalInterface.class.getName());

        IMessage msg=()-> System.out.println("Hello World");
        _1_FunctionalInterface obj=new _1_FunctionalInterface();
        obj.greet(msg);

    }
}
