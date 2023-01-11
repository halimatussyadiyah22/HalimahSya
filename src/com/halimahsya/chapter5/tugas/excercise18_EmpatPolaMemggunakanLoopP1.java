package com.halimahsya.chapter5.tugas;

public class excercise18_EmpatPolaMemggunakanLoopP1 {
    public static void main(String[] args){
        System.out.println(" pola 1 ");
        for ( int baris = 1; baris <= 6; baris++){
            for (int kolom = 1; kolom <= baris ; kolom++ ){
                System.out.print( kolom + " ");
            }
            System.out.println();
        }

    }
}
