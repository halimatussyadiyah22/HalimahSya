package com.halimahsya.chapter5.latihan;

public class Listing10_FutureTuition {
    public static void main(String[] args){
        double biaya = 1000;
        int tahun = 0;
        while ( biaya < 20000){
            biaya = biaya * 1.07;
            tahun++;
        }
        System.out.println(" biaya sekolah akan di dobel di tahun " + tahun);
        System.out.printf( " biaya sekolah akan menjadi $%.2f di %1d tahun ", biaya, tahun);
    }
}
