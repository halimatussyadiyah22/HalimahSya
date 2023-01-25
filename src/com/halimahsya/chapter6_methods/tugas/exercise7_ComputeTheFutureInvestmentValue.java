package com.halimahsya.chapter6_methods.tugas;

import java.util.Scanner;

public class exercise7_ComputeTheFutureInvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int JUMLAH_TAHUN = 30;

        System.out.println( " \njumlah berinvestasi : ");
        double jumlah = input.nextDouble();
        System.out.println("suku bunga tahunan : ");
        double SukuBungaTahunan = input.nextDouble();

        double bungaBulanan = SukuBungaTahunan /1200;

        System.out.println("tahun   nilai yang mendatang ");
        for ( int tahun =1; tahun <= JUMLAH_TAHUN; tahun++){
            System.out.printf("%-10d", tahun);
            System.out.printf("%11.2f\n",  jumlahInvesMasaDepan(jumlah,bungaBulanan,tahun));

        }
    }
    public static double jumlahInvesMasaDepan(double jumlahInves, double bungabulanan, int tahun){
        return  jumlahInves * Math.pow(1+ bungabulanan, tahun * 12);
    }
}
