package Exercices;

import java.util.Scanner;

public class Exercise60 {
    public static void main(String[] args) {
        System.out.println("Please enter the message ");
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();
        String [] words = message.split("[ ]+");
        System.out.println("The penultimate word is " + words[words.length-2]);

    }
}
