package com.halimahsya.chapter5.tugas;

import java.util.Scanner;

public class Excercise21_pinjamandengansukubunga {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print(" jumlah hutang : ");
        double jumlahHutang = input.nextDouble();
        System.out.print(" nomer tahun :");
        int nomertahun = input.nextInt();

                System.out.println("SukuBunga   PembayaranBulanan   TotalPembayaran");

                for( double i = 5.0; i <= 8; i += 0.125){
                    System.out.printf("%-5.3f" , i);
                    System.out.print("%             ");
                    double SukuBungaBulanan = i / 1200;
                    double BayaranBulanan =  jumlahHutang *
                            SukuBungaBulanan/(1 -1 / Math.pow(1 + SukuBungaBulanan, nomertahun * 12));
                    System.out.printf("%-19.2f" ,BayaranBulanan);
                    System.out.printf("%-8.2f\n", (BayaranBulanan*12) * nomertahun);
                }
    }
}
