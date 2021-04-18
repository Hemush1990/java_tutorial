package com.tutotial.java;

public class Arrays {
    public static void main(String[] args) {
        int [] numbers = new int [5];
        System.out.println(numbers[1]);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i*4;
            System.out.println(numbers[i]);
        }
        System.out.println();
        int [] number1 = {4, 6, 7};
        int sum = 0;
        for (int i = 0; i < number1.length ; i++) {
            System.out.println(number1[i]);
            sum+=number1[i];


        }
        System.out.println(sum);
        String [] string = new String[3];

    }

}
