package Exercices;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number:");
        String number = in.next();
        int newNumber = Integer.parseInt(number);
        System.out.println(newNumber);
    }
}
