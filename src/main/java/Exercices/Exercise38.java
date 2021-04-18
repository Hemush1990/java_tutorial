package Exercices;

import java.util.Scanner;

public class Exercise38 {
    public static void main(String[] args) {
       String test = "Hello, my dear!! 2345";
        count(test);


    }
        public static void count(String t){
            char [] ch = t.toCharArray();
            int letter = 0;
            int space = 0;
            int other = 0;
            int number = 0;

            for (int i = 0; i < t.length(); i++) {
               if (Character.isLetter(ch[i])){
                   letter++;
               }else if(Character.isSpaceChar(ch[i])){
                   space++;
               }else if(Character.isDigit(ch[i])){
                   number++;
               }else{
                   other++;
               }
            }
            System.out.println(letter + " letter");
            System.out.printf("numbers are " + number);
            System.out.printf("\nspaces are " + space);
            System.out.printf("\nothers are " + other);

            }
        }


