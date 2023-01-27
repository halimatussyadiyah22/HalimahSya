package com.halimahsya.chapter6_methods.tugas;

public class exercise27_emirp {
    public static void main(String[] args) {
        final  int  NUMBER_OF_EMIRPS = 100,EMIRPS_PER_LINE = 10;

        int count = 0,n=2;
        while (count < NUMBER_OF_EMIRPS) {
            if (isEmirp(n)){
                count++;
                System.out.print(count % EMIRPS_PER_LINE == 0 ? n + "\n" : n + " ");
            }
            n++;
        }

    }
    public  static boolean isEmirp(int num){
        return Primenumbermethod.isPrime(num) &&
                !exercise3_PolindromeIntegar.isPalindrome(num) &&
                Primenumbermethod.isPrime(exercise3_PolindromeIntegar.reverse(num));
    }
}
