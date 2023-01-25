package com.halimahsya.chapter6_methods.tugas;

import java.util.Scanner;

public class exercise2_sumTheDigitInAnIntegar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" masukan bilangan : ");
        long nomer = input.nextLong();

        System.out.println(" jumlah dijit dari " + nomer + " adalah " + jumlahDijit(nomer));

    }
    public  static long jumlahDijit(long n){
        int jumlah = 0;
        while (n > 0){
            jumlah += n % 10;
            n/= 10;
        }
        return jumlah;
    }
}
