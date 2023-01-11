package com.halimahsya.chapter5.tugas;

import java.util.Scanner;

public class excercise22_jadwalAmortisasiPinjaman {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print(" jumlah hutang: ");
        double jumlahHutang = input.nextDouble();
        System.out.print(" tahun : ");
        int tahun = input.nextInt();
        System.out.print(" suku bunga tahunan: ");
        double bungatahunan = input.nextDouble();


        double bungabulanan = bungatahunan / 1200;
        double bayaranbulanan = jumlahHutang * bungabulanan /(1-1/
                Math.pow(1 + bungabulanan, tahun * 12));
        System.out.printf(" bayaran bulanan: %.2f\n", bayaranbulanan);
        System.out.printf(" total bayaran : %.2f\n", (bayaranbulanan*12) * tahun);
        double neraca = jumlahHutang,pokok,bunga;
        System.out.println(" bayaran#   pokok   bunga   neraca");
        for (int i = 1; i <= tahun * 12; i++){
            bunga = bungabulanan * neraca;
            pokok = bayaranbulanan - bunga;
            neraca = neraca - pokok;
            System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, bunga,pokok,neraca);

        }

    }
}
