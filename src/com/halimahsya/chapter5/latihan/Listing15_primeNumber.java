package com.halimahsya.chapter5.latihan;

public class Listing15_primeNumber {
    public static void main(String[] args){
        final int NomerPrima = 50, NomerprimaPerbaris = 10;
        int jumlah = 0, nomer = 2;

        System.out.println(" nomer pertama prima adalah \n");

        while (jumlah < NomerPrima){
            boolean isprime = true;
            for( int divisor = 2; divisor <= nomer / 2; divisor++){
                if (nomer % divisor ==0 ){
                    isprime = false;
                    break;
                }
            }
            if (isprime){
                jumlah++;
                if ( jumlah % NomerprimaPerbaris == 0){
                    System.out.println(nomer);
                }
                else
                    System.out.print( nomer + " ");
            }
            nomer++;
        }
    }
}
