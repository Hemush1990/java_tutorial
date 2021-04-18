package com.tutotial.java;

class Bikes{

    boolean power;
    int speed;


    void start(){
        power = true;
        speed = 0;

    };

    void stop(){
        power = false;
        speed = 0;
    };

    void accelerate(int newSpeed){
        speed = newSpeed;
    };

    void printState(){
        System.out.println("Current state");
        System.out.println("Power - " + power);
        System.out.println("Speed - " + speed);
    };
};

public class Bike {
    public static void main(String[] args) {
        Bikes b1, b2;

        b1 = new Bikes();
        b2 = new Bikes();

        b1.start();
        b1.stop();
        b1.accelerate(5);
        b1.printState();

        b2.start();
        b2.stop();
        b2.accelerate(50);
        b2.printState();


    }
}
