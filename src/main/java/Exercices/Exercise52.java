package Exercices;

import java.util.Scanner;

public class Exercise52 {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();

        int sum = number1 + number2;

        boolean result = true;
        if(number3==sum){
            System.out.println(result);
        }else{
            System.out.println("false");
        }
    }
}
