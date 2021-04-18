package com.tutotial.java;

public class Potoki {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        mythread.start();

        MyThread mythread1 = new MyThread();
        mythread1.start();

        Thread thread = new Thread(new Runner());
        thread.start();

    }
}
class Runner implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello, my friend" + i);

        }
    }
}
class MyThread extends Thread{
    public void run(){
        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello, my friend" + i);
            
        }
    }
}
