package Exercices;

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = in.nextInt();
        System.out.println("The sum of digits is " + sumDigits(number));

    }


    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
