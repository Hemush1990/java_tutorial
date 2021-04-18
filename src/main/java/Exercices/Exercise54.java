package Exercices;

import java.util.Scanner;

public class Exercise54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number");
        int number1 = in.nextInt();
        System.out.println("Input the second number");
        int number2 = in.nextInt();
        System.out.println("Input the third number");
        int number3 = in.nextInt();
        System.out.println("The result is " + testLastDigit(number1, number2, number3, true));
    }

        public static boolean testLastDigit(int x, int y, int z, boolean number1number2number3){
        return(x%10==y%10) || (x%10==z%10) || (y%10==z%10);

    }
}
