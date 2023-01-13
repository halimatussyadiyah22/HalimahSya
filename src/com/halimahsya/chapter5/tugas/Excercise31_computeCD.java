package com.halimahsya.chapter5.tugas;

import java.util.Scanner;

public class Excercise31_computeCD {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print(" masukan jumlah inisial deposit : ");
        double jumlah = input.nextDouble();
        System.out.print(" masukan hasil persentase tahunan : ");
        double persentaseTahunan = input.nextDouble();
        System.out.print(" masukan periode jatuh tempo(jumlah bulanan) : ");
        int bulan = input.nextInt();

        System.out.println(" nilai bulanan CD ");

        for( int m = 1; m <= bulan; m++){
            jumlah += jumlah*(persentaseTahunan/1200);
            System.out.printf("%-7d%.2f\n", m, jumlah);

        }

    }
}
