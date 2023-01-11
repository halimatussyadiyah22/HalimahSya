package com.halimahsya.chapter5.tugas;

import java.util.Scanner;

public class Excercise17_piramid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print(" masukan jumlah garisnya : ");
        int jumlahgaris = input.nextInt();

        for(int baris = 1; baris <= jumlahgaris; baris++ ) {
            for (int s = jumlahgaris - baris; s >= 1; s--) {
                System.out.print("  ");
            }
            for (int l = baris; l >= 2; l--){
                System.out.print(l + "  ");
            }
            for (int r = 1; r <= baris; r++) {
                System.out.print(r + "  ");
            }
            System.out.println();
        }


    }
}
