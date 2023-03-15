package com.halimahsya.chapter9_objectAndClasses.tugas;

public class excercise3_UsetheDate {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();

        System.out.println("\nThe dates and times for elapsedtimes 1000," + "10000,100000,1000000,\n10000000,100000000,1000000000," + " and 10000000000,respectively");
        for (long i = 10000; i <= 1e11; i *= 10){
            date.setTime(i);
            System.out.println(date.toString());
        }
    }
}
