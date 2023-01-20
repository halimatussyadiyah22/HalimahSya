package com.halimahsya.chapter6_methods.latihan;

public class Listing7_PrimeNumberMethod {
    public static void main(String[] args){
        System.out.println( " pertama angka prima 50 adalah \n");
        printPrimeNumber(50);
    }
    public static void printPrimeNumber( int nomerprima){
        final int nomer_prima_pergaris =10;
        int jumlah = 0;
        int nomer = 2;

        while ( jumlah < nomerprima){
            if (primaAdalah(nomer)){
                jumlah++;

            if (jumlah%nomer_prima_pergaris == 0){
                System.out.printf("%-5s\n", nomer);
            }
            else
                System.out.printf("%-5s", nomer);
        }
        nomer++;
    }

}
    public static boolean primaAdalah(int nomer){
        for (int divisor = 2; divisor <= nomer/ 2; divisor++){
            if (nomer%divisor == 0) {
                return false;



        }

    }
        return true;
}
}

