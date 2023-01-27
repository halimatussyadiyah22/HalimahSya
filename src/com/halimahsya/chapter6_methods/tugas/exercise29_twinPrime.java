package com.halimahsya.chapter6_methods.tugas;

public class exercise29_twinPrime {
    public static void main(String[] args) {
        System.out.println();
        for (int p = 2; p < 1000; p++){
            if (isTwinPrime(p))
                System.out.println("(" + p + ", " + (p+2) + ")");
        }

    }
    public static boolean isTwinPrime(int num){
        return  Primenumbermethod.isPrime(num) && Primenumbermethod.isPrime(num+2);
    }
}
