package com.tutotial.java;

import java.io.IOException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) throws IOException, ScannerException {
        Scanner in = new Scanner(System.in);
        while(true){
            int x = Integer.parseInt(in.nextLine());

            if(x!=0){
                throw new ScannerException("Something, except zero");
            }
        }
    }
}
