package com.tutotial.java;

import java.io.*;

public class FileInputstream {
    public FileInputstream() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        FileInputStream file = null;
        InputStreamReader isr = null;
        int b =0;
        file = new FileInputStream("Text.txt");
        isr = new InputStreamReader(file, "UTF-8");
        while((b = isr.read())!=-1){
            System.out.println((char)b);
        }

            file.close();

        isr.close();


    }
    FileWriter filewriter = new FileWriter("Text.txt", true);
    String str = "Hot";
//filewriter.write(str);
//    filewriter.close();

    File file = new File("Text.txt");
}
