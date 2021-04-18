package Exercices;

import java.util.Scanner;

public class Exercise49 {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
         if (number%2==1){
             System.out.println("1");
         }else{
             System.out.println("0");
         }

    }
}
