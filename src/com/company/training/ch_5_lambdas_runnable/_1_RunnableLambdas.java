package com.company.training.ch_5_lambdas_runnable;


public class _1_RunnableLambdas {

    public static void main(String[] args) {
        System.out.println("------------starting execution---------"+ _1_RunnableLambdas.class.getName());

        System.out.println("Hello from Master thread; Name="+Thread.currentThread().getName()+"; ID="+Thread.currentThread().getId());
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from T1; Name="+Thread.currentThread().getName()+"; ID="+Thread.currentThread().getId());
            }
        };

        Thread t1=new Thread(r1);

        //people execute thread like below
        //t1.run();
        // it is NOT executed by the new thread you just created. Instead the run() method is executed by the thread that created the thread


        //t1.run(); // not the right thing to do.Run this code by uncommenting this line
        t1.start(); //correct way of running thread

        //Using Lambdas

        Runnable r2=()->{
            System.out.println("Hello from T2; Name="+Thread.currentThread().getName()+"; ID="+Thread.currentThread().getId());
        };

        Thread t2=new Thread(r2);
        t2.start();

        Thread t3=new Thread(()->System.out.println("Hello from T3; Name="+Thread.currentThread().getName()+"; ID="+Thread.currentThread().getId()));
        t3.start();

    }
}
