package Exercices;

import java.util.Scanner;

public class Exercise57 {
    public static void main(String[] args) {

        System.out.println("Please enter a number: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(factorNumber(x));

    }

    public static int factorNumber(int num) throws ArithmeticException{
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if(num%i==0 && i*i!=num){
                count+=2;
            }else if
                (i*i == num){
                count++;
            }

        }return count;
    }
}
