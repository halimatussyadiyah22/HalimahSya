package com.halimahsya.chapter6_methods.tugas;

public class exercise1_pentagonalNumber {
    public static void main(String[] args) {
        final int BILANGAN_PENTAGONAL = 100;
        final int BILANGAN_PER_BARIS = 10;

        System.out.println(" 100 bilangan pentagonal pertama, sepuluh perbaris : ");
        for (int i = 1; i <= BILANGAN_PENTAGONAL; i++){
            if (i % BILANGAN_PER_BARIS == 0)
                System.out.printf("%7d\n", getPentagonalNumber(i));
            else
                System.out.printf("%7d", getPentagonalNumber(i));

        }
    }
    public static int getPentagonalNumber( int n){
        return (n* (3* n - 1)) / 2;
    }
}
