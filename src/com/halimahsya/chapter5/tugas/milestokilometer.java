package com.halimahsya.chapter5.tugas;

public class milestokilometer {
    public static void main(String[] args){
        final double kilometerpemile = 1.609;

        System.out.println(" miles kilometer ");
        for ( int i = 1; i <= 10; i++){
            System.out.printf(" %-13d%-10.3f\n", i,(i * kilometerpemile));
        }
    }
}
