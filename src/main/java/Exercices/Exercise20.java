package Exercices;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = in.nextInt();
        String hexDecimal = Integer.toHexString(number);
        System.out.println(hexDecimal);

    }
}
