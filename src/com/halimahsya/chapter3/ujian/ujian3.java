package com.halimahsya.chapter3.ujian;

import java.util.Scanner;

public class ujian3 {
    public static void main(String[] args) {
        String nama;
        double penjualan=0,komisi=0,jasa=0,pendapatan=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Nama sales = ");
        nama = input.nextLine();
        System.out.print(" masukan jumlah penjualan sales hari ini = ");
        penjualan = input.nextDouble();


        double  a = penjualan * 0.10;
        double b = penjualan * 0.15;
        double c = penjualan * 0.20;


        System.out.println( " =============================================================");

            if (penjualan <= 200000) {
                jasa = 10000;
                komisi =   a;
            } else if (penjualan <= 500000){
                jasa = 20000;
            komisi =   b;
        }else if (penjualan >= 500000) {
            jasa = 30000;
            komisi =  c;

            }else
            System.out.println(" salah !");




    pendapatan = jasa + komisi;


        System.out.println( " nama sales " + nama  );
        System.out.println( " Selamat, total penjualan anda hari ini adalah  " + String.format("%.2f", komisi) );
        System.out.println( " anda berhak mendapatkan komisi  " +  String.format("%.2f", komisi) + " dan uang jasa " +  String.format("%.2f", jasa)  );
        System.out.println( " Total pendapatan anda hari ini adalah" +  String.format("%.2f", pendapatan) );





    }
}