package com.tutotial.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        File file = new File("asv.doc");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("This file doesn't exist");
        }

    }
}

