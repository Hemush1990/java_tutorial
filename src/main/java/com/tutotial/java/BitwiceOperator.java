package com.tutotial.java;

public class BitwiceOperator {
    public static void main(String[] args) {
        int a = 15;
        int b = 25;


        int c = a & b; //if both is 1, then answer is 1, otherwise = 0
        System.out.println(c);

        int d = a|b; // if any of the value is 1, it is 1
        System.out.println(d);
    }
}
