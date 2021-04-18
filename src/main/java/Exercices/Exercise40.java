package Exercices;

import java.nio.charset.Charset;

public class Exercise40 {
    public static void main(String[] args) {
        System.out.println("The list of available charsets: ");
        for(String str: Charset.availableCharsets().keySet()){
            System.out.println(str);
        }
    }
}
