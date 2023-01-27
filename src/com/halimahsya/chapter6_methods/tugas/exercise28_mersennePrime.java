package com.halimahsya.chapter6_methods.tugas;

public class exercise28_mersennePrime {
    public static void main(String[] args) {
        System.out.println("\np           2^p-1");
        System.out.println("--------------------------------");
        for (int p = 2; p <= 31; p++ ){
            if (Primenumbermethod.isPrime(p)){
                System.out.printf("%-13d", p);
                System.out.println(merseneprime(p));
            }
        }

    }
    public static int merseneprime(int num){
        return (int) Math.pow(2, num) - 1;
    }
}
