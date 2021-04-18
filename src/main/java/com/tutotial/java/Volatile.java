package com.tutotial.java;

import java.util.Scanner;

public class Volatile {
    public static void main(String[] args) {
        MThread thread = new MThread();
        thread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        thread.shutdown();

    }
}

class MThread extends Thread{
    private volatile boolean running = true; //variables aren;t cached
    @Override
    public void run() {
        while(running){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void shutdown(){
        this.running = false;
    }
}