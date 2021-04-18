package com.tutotial.java;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100 ; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.get(5));
        System.out.println(list.size());

        for (int i = 3; i < list.size(); i++) {
            int doubles = 0;
            if(i%2==0) {
                 doubles = list.get(i);
            }System.out.println(doubles);
        }list.remove(0);

    }
}
