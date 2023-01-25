package com.halimahsya.chapter6_methods.tugas;

public class Primenumbermethod {
    public static void main(String[] args) {
        System.out.println(" 50 angka pertama adalah \n");
        printnomerprima(50);
    }
    public static void printnomerprima(int nomerprima){
        final int ANGKA_PRIMA_PERBARIS = 10;
        int jumlah = 0;
        int nomer = 2;

        while (jumlah < nomerprima){
            if (isPrime(nomer)){
                jumlah++;
                if (jumlah% ANGKA_PRIMA_PERBARIS == 0){
                    System.out.printf("%-5s\n", nomer);
                }
                else
                    System.out.printf("%-5s", nomer);
            }
            nomer++;
        }
    }
    public static boolean isPrime(int nomer){
        for (int divisor = 2; divisor <= nomer/2; divisor++){
            if (nomer%divisor == 0)
                return false;
        }
        return true;
    }
}
