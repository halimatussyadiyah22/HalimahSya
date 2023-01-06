package com.halimahsya.chapter2.ujian;

import java.util.Scanner;
public class soal2 {
    public static void main(String[] args){

        final double $1 = 15.665;
        Scanner input = new Scanner(System.in);
        System.out.print("masukan nilai rupiah");
         
        double nilai = input.nextDouble();
        double konveksi = nilai/ $1;
        
        System.out.println(" nilai dollar adalah " + "$" + String.format("%.2f",  konveksi ) );

    }
    
}
