package com.tutotial.java;

 class Base{
  public void print(){
      System.out.println("Hello");
    }
}

class Derived extends Base{
     public void print(){
         super.print(); //from Base
         System.out.println(" World ");
     }
}

public class Super {
    public static void main(String[] args) {

        Base b1 = new Base();
        b1.print();

    }
}
