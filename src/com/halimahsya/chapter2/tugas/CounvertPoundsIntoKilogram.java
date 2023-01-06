package com.halimahsya.chapter2.tugas;

import java.util.Scanner;
public class CounvertPoundsIntoKilogram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final double KilogramPerPounds = 0.454;

        System.out.println("masukan jumlah per pounds"); 
        double Pounds = input.nextDouble(); 

        double Kilogram = Pounds * KilogramPerPounds;

        System.out.println("hasil pounds ke kilogram " + 
        " adalah " + Kilogram);

    }
    
}
