package com.tutotial.java;

public enum SeasTemp {

    Summer(36), WINTER(2), SPING(10), AUTUMN(15);


    private int temprature;

    SeasTemp(int temprature){
        this.temprature = temprature;
    }

    public int getTemprature() {
        return temprature;
    }


    @Override
    public String toString() {
        return "The season's temperature is" + temprature
                ;
    }

}
