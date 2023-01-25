package com.halimahsya.chapter5.latihan;

import java.util.Scanner;

public class Listing4_subtractionQuizloop {
    public static void main(String[] args){
        final int nomerdaripertanyaan = 5;
        int hitunganyangbenar = 0;
        int hitungan = 0;
        long waktumulai = System.currentTimeMillis();
        String keluaran = " ";
        Scanner input = new Scanner(System.in);

        while (hitungan < nomerdaripertanyaan){
            int nomer1 = (int) (Math.random() * 10);
            int nomer2 = (int) (Math.random() * 10);

            if(nomer1 < nomer2){
                int temp = nomer1;
                nomer1 = nomer2;
                nomer2 = temp;
            }
            System.out.println(" apakah " + nomer1 + " - " + nomer2 + " ? ");
            int jawaban = input.nextInt();

            if( nomer1 - nomer2 == jawaban){
                System.out.println("kamu benar ! ");
                hitunganyangbenar++;
            }
            else
                System.out.println(" jawabanmu salah.\n" + nomer1 +
                        "-" + nomer2 + " seharusnya " + ( nomer1 - nomer2) );

            hitungan++;

            keluaran += "\n" + nomer1 + " - " + nomer2 + " = " + jawaban +
                    ((nomer1 - nomer2 == jawaban) ? " benar" : " salah ");
        }
        long akhirwaktu = System.currentTimeMillis();
        long waktutes = akhirwaktu - waktumulai;

        System.out.println(" hitungan yang benar adalah " + hitunganyangbenar +
                "\nwaktu tes adalah " + waktutes / 1000 + " detik \n" + keluaran);
    }
}
