package com.halimahsya.chapter6_methods.tugas;

import com.halimahsya.chapter6_methods.latihan.Listing7_PrimeNumberMethod;

import java.util.Scanner;

public class exercise10_UseisPrimeMethod1 {
    public static void main(String[] args) {
        int nomerprima =0;

        for (int i = 1; i < 1000; i++){
            if(Primenumbermethod.isPrime(i))
                nomerprima++;
        }
        System.out.printf(" nilai prima kurang dari 10000: " + nomerprima);
    }
}
