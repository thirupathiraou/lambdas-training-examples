package com.company.training.ch_4_lambdas_interface_implementations;

import com.company.training.ch_1_introduction.IMessage;
import com.company.training.ch_1_introduction._2_1_EnglishMessage;
import com.company.training.ch_1_introduction._2_2_SpanishMessage;
import com.company.training.ch_1_introduction._2_3_FrenchMessage;

public class _1_WelcomeMessageInterfaceVSLambdas {

    public void greet(IMessage message)
    {
        message.printMessage();
    }
    public static void main(String[] args) {
        System.out.println("------------starting execution---------"+ _1_WelcomeMessageInterfaceVSLambdas.class.getName());

        IMessage spanishMsg=new _2_2_SpanishMessage();

        IMessage lambdaSpanishMsg=()->{System.out.println("Buenos Dias from Lambda"); };

        IMessage anonymousMsg=new IMessage() {
            @Override
            public void printMessage() {
                System.out.println("Buenos Dias from Anonymous");
            }
        };

        //What is difference between spanishMsg & lambdaSpanishMsg??
        spanishMsg.printMessage();
        lambdaSpanishMsg.printMessage();
        anonymousMsg.printMessage();

    }
}
