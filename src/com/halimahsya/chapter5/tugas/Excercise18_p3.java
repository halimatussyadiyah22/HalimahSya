package com.halimahsya.chapter5.tugas;

public class Excercise18_p3 {
    public static void main(String[] args){
        int jumlahgaris = 6;
        System.out.println( " pola 3");
        for ( int baris= 1; baris <= jumlahgaris; baris++){
        for (int s = jumlahgaris - baris; s >= 1; s--){
            System.out.print("  ");
        }
        for (int kolom = baris; kolom >= 1; kolom-- ){
            System.out.print(kolom + " ");
        }
        System.out.println();
        }
        }
    }