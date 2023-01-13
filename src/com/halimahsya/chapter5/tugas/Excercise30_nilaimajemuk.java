package com.halimahsya.chapter5.tugas;

import java.util.Scanner;

public class Excercise30_nilaimajemuk {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print(" masukan jumlah (e.g.,100):");
        double jumlah = input.nextDouble();
        System.out.print(" masukah tingkatan bunga perbulan ( e.g., 5): ");
        double TingkatanBunga = input.nextDouble();
        System.out.print(" masukan jumlah bulan ( e.g., 6):");
        int bulan = input.nextInt();

        double Bungaperbulan = TingkatanBunga / 1200;

        double nilaiMajemuk = 0;
        for (int m = 1; m <= bulan; m++){
            nilaiMajemuk = (jumlah + nilaiMajemuk)* ( 1 + Bungaperbulan);
        }
        System.out.printf(" jumlah dalam penyimpanan akun setelah " + bulan +
                " bulan : $%.2f\n", nilaiMajemuk);
    }
}
