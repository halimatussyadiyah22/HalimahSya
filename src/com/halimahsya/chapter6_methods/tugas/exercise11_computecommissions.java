package com.halimahsya.chapter6_methods.tugas;

import java.util.Scanner;

public class exercise11_computecommissions {
    public static void main(String[] args) {

        System.out.println("\n jumlahjual      komisi ");
        System.out.println("------------------------------");
        for (double jumlahSales = 10000; jumlahSales <= 100000; jumlahSales+= 5000 ){
            System.out.printf("%-16.0f", jumlahSales);
            System.out.printf("%8.1f\n", hitungkomisi(jumlahSales));
        }

    }
    public static double hitungkomisi(double jumlahSales ){
        double balance,komisi;
        balance = komisi = 0.0;

        if (jumlahSales >= 10000.01)
            komisi += (balance = jumlahSales -10000) * 0.12;
        if (jumlahSales >= 5000.01)
            komisi += (balance -= balance - 5000)* 0.10;
        if (jumlahSales >= 0.01)
            komisi += balance * 0.08;
        return komisi;
    }
}
