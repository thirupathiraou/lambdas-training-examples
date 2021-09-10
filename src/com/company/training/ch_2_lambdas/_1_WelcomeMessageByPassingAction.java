package com.company.training.ch_2_lambdas;


public class _1_WelcomeMessageByPassingAction {

    public void greet(IMessage message)
    {
        message.printMessage();
    }

    public static void main(String[] args) {
        System.out.println("------------starting execution---------"+_1_WelcomeMessageByPassingAction.class.getName());

        _1_WelcomeMessageByPassingAction msg=new _1_WelcomeMessageByPassingAction();
        msg.greet(()-> System.out.println("Good Morning"));
        msg.greet(()-> System.out.println("Buenos Dias"));
        msg.greet(()-> System.out.println("Bonjur"));

    }
    //functional interface- Single abstract Method
    public interface IMessage {

        public void printMessage();
    }
}

