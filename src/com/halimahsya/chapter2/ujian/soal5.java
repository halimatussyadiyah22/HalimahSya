package com.halimahsya.chapter2.ujian;

import java.util.Scanner;

public class soal5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         
        System.out.print("masukan nilai jarak perjalanan = ");
        double jarak = input.nextDouble();
        System.out.print("masukan jarak konsumsi = ");
        double konsumsi = input.nextDouble();
        System.out.print("masukan harga perliter = ");
        double harga = input.nextDouble();

        double total = (jarak / konsumsi )* harga;

        System.out.println("total biaya perjalanan anda dalam " + 
            jarak + " km " + " adalah " + " Rp " + String.format("%.2f", total ));
    }    
}
