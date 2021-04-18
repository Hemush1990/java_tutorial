package com.tutotial.java;

import java.util.ArrayList;
import java.util.List;

public class Downgrading {
    private static Object Integer;

    public static void main(String[] args) {
        List animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("cow");
        animals.add("zebra");

        String animal = (String) animals.get(0);
        System.out.println(animal);

        ///Generics

        List <Integer> animals1 = new ArrayList<>(); //downgrading isn't need

    }
}
