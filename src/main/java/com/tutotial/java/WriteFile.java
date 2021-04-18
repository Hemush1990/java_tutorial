package com.tutotial.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Text.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println("Hello, my dear");
        pw.close();
    }
}
