package Exercices;

import java.util.Scanner;

public class Exercise61 {
    public static void main(String[] args) {
        System.out.println("Please enter a sentence ");
        Scanner in = new Scanner(System.in);
        String word = in.next();
        System.out.println(message(word));

    }
        public static String message(String du){
            String line= " ";
        for (int i = du.length(); i>=0 ; i--) {
            line +=du[i];
        }
            return line;
        }
    }

