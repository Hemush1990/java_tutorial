package com.tutotial.java;

import java.text.SimpleDateFormat;

class MyDateUtil{

    final String DATE_PATTERN_TARGET = "mm/dd/yyyy";
    public String getFormatedDate(java.util.Date d){
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTERN_TARGET);
        return sdf.format(d);


    };
}
public class Date extends java.util.Date {
    public static void main(String[] args) {
        MyDateUtil util = new MyDateUtil();
        Date now = new Date();
        System.out.println( now );

        String formatedDate = util.getFormatedDate( now );
        System.out.println(formatedDate);
    }
}
