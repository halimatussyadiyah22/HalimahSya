package com.halimahsya.chapter5.latihan;
import java.util.Scanner;
public class Listing1_whileloops {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int nomer1 = (int)(Math.random() * 10);
        int nomer2 = (int)(Math.random() * 10);

        System.out.println("apa itu " + nomer1 + " + " + nomer2 + " ? ");
        int jawaban = input.nextInt();

        while (nomer1 + nomer2 != jawaban){
            System.out.println(" jawaban salah. coba lagi. apa itu  " + nomer1 + " + " + nomer2 + " ? ");
            jawaban = input.nextInt();
        }
        System.out.println(" kamu berhasil ");
    }

}
