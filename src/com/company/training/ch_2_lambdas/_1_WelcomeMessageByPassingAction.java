package com.company.training.ch_2_lambdas;


public class _1_WelcomeMessageByPassingAction {

    public void greet(IMessage message)
    {
        message.printMessage();
    }

    public static void main(String[] args) {
        System.out.println("------------starting execution---------"+_1_WelcomeMessageByPassingAction.class.getName());

        _1_WelcomeMessageByPassingAction msg=new _1_WelcomeMessageByPassingAction();

        IMessage englishMsg=()-> System.out.println("Good Morning");
        IMessage spanishMsg=()-> System.out.println("Good Morning");
        IMessage frenchMsg=()-> System.out.println("Good Morning");

        msg.greet(englishMsg);
        msg.greet(spanishMsg);
        msg.greet(frenchMsg);


    }
    //functional interface- Single abstract Method
    public interface IMessage {

        public void printMessage();
    }
}

