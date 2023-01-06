package com.halimahsya.chapter5.tugas;

import java.util.Scanner;

public class edisimengulangi {
    public static void main(String[] args){
        int hitunganbenar=0,hitung=0,nomer1,nomer2,jawaban;
        long waktudimulai = System.currentTimeMillis();
        final int nomerdaripertanyaan = 10;

        String output ="";

        Scanner input = new Scanner(System.in);

        while (hitung < nomerdaripertanyaan){
            nomer1 = 1 + (int)(Math.random() * 15);
            nomer2 = 1 + (int)(Math.random() * 15);

            System.out.println(" apakah " + nomer1 + " + " + nomer2 + " ? ");
            jawaban = input.nextInt();

            if(nomer1 + nomer2 == jawaban) {
                System.out.println(" kamu benar ");
                hitunganbenar++;
            }else
                System.out.println(" jawaban kamu salah.\n" + nomer1 + " " + nomer2 + " seharusnya "
                + (nomer1 + nomer2));
            hitung++;
            output = " \n " + nomer1 + " + " + nomer2 + " = " + jawaban +
                    ((nomer1 + nomer2 == jawaban ) ? " benar " : " salah ");

            long waktuberakhir = System.currentTimeMillis();
            long waktutes = waktuberakhir - waktudimulai;

            System.out.println(" hitungan yang benar adalah " + hitunganbenar + " waktu tes adalah "
             + waktutes / 1000 + " detik/n" + output);


        }
    }
}
