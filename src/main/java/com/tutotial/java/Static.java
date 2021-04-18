package com.tutotial.java;

class MyMth{
    public int add(int x, int y){
        return x + y;
    };

    public int substr(int x, int y){
        return x - y;
    };

    public static int subst(int x, int y){
        return x-y;
    }
}

public class Static {
    public static void main(String[] args) {

        MyMth obj = new MyMth();
        obj.add(3, 5);
        obj.substr(7,4);

        MyMth.subst(7,3);
    }
}
