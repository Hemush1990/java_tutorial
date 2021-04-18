package com.tutotial.java;

public class Serializable {


    private int id;
    private String name;

    public Serializable(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Serializable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
