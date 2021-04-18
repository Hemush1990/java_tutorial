package Exercices;

import java.util.Scanner;

public class Exercice19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your first number:");
        int number1 = in.nextInt();
        String binNumber = Integer.toBinaryString(number1);
        System.out.println("The binary number is: " + binNumber);
    }
}
