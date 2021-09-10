package com.company.training.ch_3_typeinference;

public class _2_TypeInferenceDemo {


    public static void main(String[] args) {
        System.out.println("------------starting execution---------"+ _2_TypeInferenceDemo.class.getName());

        StringLength sl1=(String a)->{return a.length();};
        //more short version
        StringLength sl2=(a)->{return a.length();};
        //further trimmed version
        StringLength sl3=a->a.length();

        System.out.println("---------output--------------------");

        System.out.println(printLambdaLength(sl3));
    }

    public static int printLambdaLength(StringLength l){
        return l.getStringLength("Hello world");
    }

    public interface StringLength{
        public int getStringLength(String  str);
    }
}
