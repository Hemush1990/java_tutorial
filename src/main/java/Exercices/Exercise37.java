package Exercices;

import java.util.Scanner;

public class Exercise37 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sentence");
        char [] letters = in.nextLine().toCharArray();
        System.out.println("Reverse string ");
        for (int i = letters.length-1; i >0; i--) {
            System.out.print(letters[i]);
        }

    }
}
