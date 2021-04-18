package Exercices;

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = in.nextInt();
        if(number1!=number2){
            System.out.println(number1+"!="+number2);
        }
        if(number1<number2){
            System.out.println(number1+"<"+number2);
        }else if (number1>number2){
            System.out.println(number1+">"+number2);
        }else{
            System.out.println(number1+"="+number2);
        }

        if(number1<=number2){
            System.out.println(number1+"<="+number2);
        }else if (number1>=number2){
            System.out.println(number1+">="+number2);
        }else{
            System.out.println(number1+"="+number2);
        }

        if(number1==number2){
            System.out.printf("%d==%d", number1, number2);
        }

    }
}
