package com.tutotial.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableWrite  implements java.io.Serializable {
    public static void main(String[] args) {
        Serializable person1 = new Serializable(123, "Meline");
        Serializable person2 = new Serializable(456, "Heghine");
        Serializable [] person3 = {new Serializable(123, "Meline"), new Serializable(456, "Heghine")};

        try {
            FileOutputStream fos = new FileOutputStream("People.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.writeInt(person3.length);
            for (Serializable people: person3) {
                oos.writeObject(people);
            }
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
