package com.halimahsya.chapter5.tugas;

public class excercise19_polaPiramid {
    public static void main(String[] args){
        int mulaikanan =0,ruangakhir =7,baris,r,ruangmulai;
        for (baris = 1; baris <= 128; baris += baris){
            for (ruangmulai = 0; ruangmulai < ruangakhir; ruangmulai++){
                System.out.print("    ");
            }
            for (int l = 1; l <= baris; l += l){
                System.out.printf("%4d", (l));
            }
            for(r = mulaikanan; r > 0; r /= 2){
                System.out.printf("%4d", (r));
            }
            System.out.println();
            ruangakhir--;
            mulaikanan = baris;
        }

    }
}
