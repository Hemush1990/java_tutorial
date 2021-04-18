package com.tutotial.java;

public class Equals {
    public static void main(String[] args) {
        Animal1 animal = new Animal1(1);
        Animal1 animal2 = new Animal1(2);
        System.out.println(animal.equals(animal2));


    }

}

 class Animal1 {
    private int id;

    public Animal1(int id){
        this.id = id;
    }
     public boolean equals(Object obj){
         Animal1 otherAnimal = (Animal1) obj;
         return this.id == otherAnimal.id;
     }
}
