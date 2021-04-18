package Exercices;

import java.util.Scanner;

public class Exercise44 {
    public static void main(String[] args) {
        System.out.println("Please enter one digit");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.printf("%d + %d%d + %d%d%d", n, n, n, n, n, n);
    }
}
