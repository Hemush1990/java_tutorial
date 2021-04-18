package com.tutotial.java;

public enum Season {
    SUMMER("Summer"), WINTER("Winter"), SPRING("Spring"), AUTUMN("Autumn");

    private String translated;



    Season (String translated){
    this.translated = translated;
    }

    public String getTranslated() {
        return translated;
    }

    @Override
    public String toString() {
        return "The translation is " +
                 translated ;
    }
}
