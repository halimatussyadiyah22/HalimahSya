package com.halimahsya.chapter5.tugas;

public class Excercise25_memasukanpi {
    public static void main(String[] args){
        double jumlah,nilai,pi,d;
        jumlah = 0;
        nilai = 10000.0;
        for (d = 1; d <= ( 2 * nilai - 1); d += 2){
            jumlah += 1/d;
            d += 2;
            jumlah -= 1 / d;
        }
        pi = 4 * jumlah;

        System.out.println(" nilai PI untuk i = 10000 : " + pi);
        jumlah = 0;
        nilai = 20000.0;
        for (d = 1; d <= ( 2 * nilai - 1); d += 2){
            jumlah += 1/d;
            d += 2;
            jumlah -= 1 / d;
        }
        pi = 4 * jumlah;

        System.out.println(" nilai PI untuk i = 20000 : " + pi);
        jumlah = 0;
        nilai = 100000.0;
        for (d = 1; d <= ( 2 * nilai - 1); d += 2){
            jumlah += 1/d;
            d += 2;
            jumlah -= 1 / d;
        }
        pi = 4 * jumlah;

        System.out.println(" nilai PI untuk i = 100000 : " + pi);



    }
}
