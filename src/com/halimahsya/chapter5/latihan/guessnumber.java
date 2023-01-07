package com.halimahsya.chapter5.latihan;

import java.util.Scanner;

public class guessnumber {
    public static void main(String[] args){
        int nomer = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println(" tebak sebuah nomer ajaib antara 0 dan 100 ");

        int tebak = -1;
        while (tebak != nomer){
            System.out.println("\nmasukan tebakanmu = ");
            tebak = input.nextInt();

            if(tebak == nomer)
                System.out.println(" ya, nomernya adalah " + nomer);
            else if (tebak > nomer) {
                System.out.println("tebakanmu terlalu tinggi");

            }else
                System.out.println(" tebakanmu terlalu rendah ");
        }

    }
}
