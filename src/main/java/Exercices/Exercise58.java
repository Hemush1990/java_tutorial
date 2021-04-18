package Exercices;

import java.util.Scanner;

public class Exercise58 {
    public static void main(String[] args) {
        System.out.println("Please enter a sentence with lowercase ");
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();

        String uppercase = " ";
        Scanner linescan = new Scanner(message);
        while(linescan.hasNext()){
            String word = linescan.next();
            uppercase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(uppercase.trim());

    }
}
