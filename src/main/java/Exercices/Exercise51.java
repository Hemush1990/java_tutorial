package Exercices;

import java.util.Scanner;

public class Exercise51 {
    public static void main(String[] args) {
        System.out.println("Enter your number ");
        Scanner in = new Scanner(System.in);
        String data = in.next();
        int convertNumber = Integer.parseInt(data);
        System.out.println("The int number is " + convertNumber);
    }
}
