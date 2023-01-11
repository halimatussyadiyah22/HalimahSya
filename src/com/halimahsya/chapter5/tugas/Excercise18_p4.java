package com.halimahsya.chapter5.tugas;

public class Excercise18_p4 {
    public static void main(String[] args){
        System.out.println(" pola 4 ");
        for (int baris = 0; baris < 6; baris++){
            for ( int ws = 0; ws < baris; ws++){
            System.out.print("  ");
            }
            for(int kolom = 0; kolom < 6 - baris; kolom++){
                System.out.print((kolom +1) + " ");
            }
            System.out.println();
        }
    }
}
