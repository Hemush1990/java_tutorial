package Exercices;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = in.nextInt();
        String octNumber = Integer.toOctalString(number);
        System.out.println(octNumber);

    }
}
