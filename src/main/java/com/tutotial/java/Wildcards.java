package com.tutotial.java;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    private static Object animal;

    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();

    }
    private static  void test(List <? extends Animal> list){
       for(Animal animal: list){
           System.out.println(animal);
       }
    }
}
