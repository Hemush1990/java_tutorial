package com.tutotial.java;

public class Potoki2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("I am going to sleep");
        Thread.sleep(3000);
        System.out.println("I am awake");
    }
}

class MyThread1 extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello!");
        }
    }
}
