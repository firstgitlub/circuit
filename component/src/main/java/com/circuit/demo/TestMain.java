package com.circuit.demo;

public class TestMain {

    public static void main(String[] args) {
        System.out.println("hello world");

        Object o = new Object();
        synchronized (o){
            try {
                o.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("=====hello world======");


        test();
    }

    public static synchronized void test(){

    }
}
