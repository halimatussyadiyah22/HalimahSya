package com.halimahsya.chapter6_methods.tugas;

public class exercise12_DisplayCharacters {
    public static void main(String[] args) {
        final int NOMER_KARAKTER_PER_BARIS = 10;
        char ch1 = '1';
        char ch2 = 'Z';

        System.out.println("\n karakter dari 1 ke Z ");
        printchars(ch1,ch2, NOMER_KARAKTER_PER_BARIS);
        System.out.println();

    }
    public static  void printchars(char ch1,char ch2,int jumlahPerbaris){
        for (char c = ch1, jumlah = 1; c <= ch2; c++,jumlah++){
            if (jumlah % jumlahPerbaris ==0)
                System.out.println(c);
            else
                System.out.print(c + " ");
        }
    }
}
