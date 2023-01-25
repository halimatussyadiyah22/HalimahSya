package com.halimahsya.chapter5.latihan;

import java.util.Scanner;

public class Listing2_GuessNumberOneTime {
    public static void main(String[] args){

        int nomer = (int)(Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.println(" tebak sebuah nomer ajaib antara 0 dan 100 ");

        System.out.println(" \nMasukan tebakanmu = ");
        int tebakan = input.nextInt();

        if(tebakan == nomer)
            System.out.println("Ya , nomernya adalah " + nomer );
        else if (tebakan > nomer) {
            System.out.println(" tebakanmu terlalu tinggi ");

        }else
            System.out.println(" tebakanmu terlalu rendah ");
    }
}
