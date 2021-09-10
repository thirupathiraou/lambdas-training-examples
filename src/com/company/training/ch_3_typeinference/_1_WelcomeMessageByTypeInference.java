package com.company.training.ch_3_typeinference;


public class _1_WelcomeMessageByTypeInference {

    public void greet(IMessage message)
    {
        message.printMessage();
    }

    public static void main(String[] args) {
        System.out.println("------------starting execution---------"+ _1_WelcomeMessageByTypeInference.class.getName());

        _1_WelcomeMessageByTypeInference msg=new _1_WelcomeMessageByTypeInference();


        //Java does Type inference and able to recognize its matching with IMessage interface method signature
        msg.greet(()-> System.out.println("Good Morning"));
        msg.greet(()-> System.out.println("Buenos Dias"));
        msg.greet(()-> System.out.println("Bonjur"));

    }
    //functional interface- Single abstract Method
    public interface IMessage {

        public void printMessage();
    }
}

