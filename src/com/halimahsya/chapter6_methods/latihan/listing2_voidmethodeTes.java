package com.halimahsya.chapter6_methods.latihan;

public class listing2_voidmethodeTes {
    public static void main(String[] args){
        System.out.println(" nilainya adalah ");
    printGrade( 78.5);
        System.out.println(" nilainya adalah ");
        printGrade(59.5);
}
public static void printGrade(double skor){
    if( skor>= 90.0){
        System.out.println("A");
        } else if( skor >= 80.0){
        System.out.println("B");
    }else if ( skor >= 70.0){
        System.out.println("C");
    }else if (skor >= 60.0){
        System.out.println("D");
    }else{
        System.out.println(" F ");
    }

    }
}
