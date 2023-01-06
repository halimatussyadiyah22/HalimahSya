package com.halimahsya.chapter2.tugas;

import java.util.Scanner;
public class runway {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukan kecepatan dan akselerasi: ");
    double kecepatan = input.nextDouble();
    double akselerasi = input.nextDouble();

    double panjang = Math.pow( kecepatan,2) / (2 * akselerasi);


    System.out.println("masukan minimum panjang landasan pacu" 
        + "pesawat adalah" + panjang);

    }
}
