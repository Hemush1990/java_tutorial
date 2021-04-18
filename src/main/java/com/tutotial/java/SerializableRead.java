package com.tutotial.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializableRead {
    public static void main(String[] args) {
        try {
            FileInputStream fls = new FileInputStream("People.bin");
            ObjectInputStream ois = new ObjectInputStream(fls);
            Serializable person1 = (Serializable) ois.readObject();
            Serializable person2 = (Serializable) ois.readObject();
            System.out.println(person1);
            System.out.println(person2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

