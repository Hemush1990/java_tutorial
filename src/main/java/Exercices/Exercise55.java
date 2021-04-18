package Exercices;

import java.util.Scanner;

public class Exercise55 {
    public static void main(String[] args) {
        System.out.println(" Please enter seconds: ");
        Scanner in = new Scanner(System.in);

        int seconds = in.nextInt();
        int  p1 = seconds%60;
        int p2 = seconds/60;
        int p3 = p2%60;
        p2=p2/60;
        System.out.println(p2 + ": " + p3 + ": " + p1);
    }
}
