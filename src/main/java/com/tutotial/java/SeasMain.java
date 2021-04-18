package com.tutotial.java;

public class SeasMain {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        System.out.println( season.getTranslated());
        System.out.println(season);
        System.out.println(season.name());

        SeasTemp temper = SeasTemp.AUTUMN;
        System.out.println(temper.getTemprature());
        System.out.println(temper);

    }
}
