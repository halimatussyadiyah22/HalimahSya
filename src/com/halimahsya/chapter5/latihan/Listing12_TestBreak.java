package com.halimahsya.chapter5.latihan;

public class Listing12_TestBreak {
    public static void main(String[] args){
        int sum = 0;
        int nomer = 0;

        while ( nomer < 20 ) {
            nomer++;
            sum += nomer;
            if (sum >= 100 )
                break;

        }
        System.out.println(" nomernya adalah " + nomer );
        System.out.println( " jumlahnya adalah " + sum );
    }
}
