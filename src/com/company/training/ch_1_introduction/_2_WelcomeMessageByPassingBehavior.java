package com.company.training.ch_1_introduction;

import com.company.training.ch_2_lambdas._1_WelcomeMessageByPassingAction;

public class _2_WelcomeMessageByPassingBehavior {

    public void greet(IMessage message)
    {
        message.printMessage();
    }
    public static void main(String[] args) {
        System.out.println("------------starting execution---------"+ _2_WelcomeMessageByPassingBehavior.class.getName());

        _2_WelcomeMessageByPassingBehavior msg=new _2_WelcomeMessageByPassingBehavior();
        msg.greet(new _2_1_EnglishMessage());
        msg.greet(new _2_2_SpanishMessage());
        msg.greet(new _2_3_FrenchMessage());

    }
}
