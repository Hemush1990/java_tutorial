package Exercices;

import java.util.Scanner;

public class Exercise59 {
    public static void main(String[] args) {
        System.out.println("Please enter the sentence ");
        Scanner in  = new Scanner(System.in);
        String message = in.nextLine();
        System.out.println(message.toLowerCase());
    }
}
