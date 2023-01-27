package com.halimahsya.chapter6_methods.tugas;

import java.util.IllegalFormatCodePointException;

public class exercise26_palindramicPrime {
    public static void main(String[] args) {
        final  int NUMBER_OF_PALINDROMIC_PRIMES = 100;
        final int NUMBER_PER_LINE = 10;
        int count = 0,n = 2;

        while (count < NUMBER_OF_PALINDROMIC_PRIMES){
            if (isPalindromicprime(n)){
                count++;
                System.out.print(count % NUMBER_PER_LINE ==0 ? n + "\n" : n+ " ");
            }
            n++;
        }
    }
    public static boolean isPalindromicprime(int num){
        return Primenumbermethod.isPrime(num) && exercise3_PolindromeIntegar.isPalindrome(num);

    }
}
