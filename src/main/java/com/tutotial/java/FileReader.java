package com.tutotial.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "/Users/user/Desktop/test.txt";

        File file = new File("/Users/user/Desktop/test.txt");
        Scanner scanner = new Scanner(file);
//        String input = scanner.nextLine();

        String line = scanner.nextLine();
        String [] numbers = line.split(" ");
        System.out.println(Arrays.toString(numbers));
        int [] number1 = new int[3];
        int counter = 0;
        for(String number: numbers){
           number1[counter++] = Integer.parseInt(number);
        }

        int [] number = new int[3];
//        while(scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }

        scanner.close();

    }
}
