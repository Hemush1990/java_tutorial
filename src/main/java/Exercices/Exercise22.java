package Exercices;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your binary number");
        String number = in.next();
        int newNumber = Integer.parseInt(number, 2);
        System.out.println(newNumber);
    }
}
