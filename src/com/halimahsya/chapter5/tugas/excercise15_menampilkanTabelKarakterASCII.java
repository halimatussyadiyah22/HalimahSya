package com.halimahsya.chapter5.tugas;

public class excercise15_menampilkanTabelKarakterASCII {
    public static void main(String[] args){
        final int nomer_karakter_per_baris = 10;
        int hitung = 0,i;

        for( i = 33; i <= 126; i++){
            hitung++;
            if ( hitung % 10 == 0)
                System.out.println((char) i);
            else
                System.out.println((char)i + " ");
        }
        System.out.println();

    }
}
