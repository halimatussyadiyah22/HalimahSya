package com.halimahsya.chapter5.tugas;

public class konfersasi {
    public static void main(String[] args){
        final double poundperkilo = 2.2;

        System.out.println(" kilogram pound ");
        for(int i = 1; i <= 199; i += 2){

            System.out.printf( "%-15d%6.1f\n", i, (i * poundperkilo));
        }
    }
}
