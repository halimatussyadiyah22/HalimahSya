package com.halimahsya.chapter5.tugas;

public class Excercise27_lompatanTahun {
    public static void main(String[] args){
        int jumlah,tahun;
        System.out.println(" semua lompatan tahun dari 101 ke 2100 : ");
        jumlah =0;
        for (tahun = 101; tahun <= 2100; tahun++){
            if ((tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0){
                jumlah++;
                System.out.print( tahun + (jumlah% 10 == 0 ? "\n" : " "));
            }
        }
        System.out.println();

    }
}
