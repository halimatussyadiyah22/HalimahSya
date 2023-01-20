package com.halimahsya.chapter6_methods.latihan;

public class Listing5_TestPassByValue {
    public static void main(String[] args){
        int nomer1 = 1;
        int nomer2 = 2;
        System.out.println(" sebelum panggilan swap metode, nomer1 adalah " + nomer1 + " dan nomer2 adalah " + nomer2);
    swap(nomer1,nomer2);
        System.out.println(" setelah panggilan swap metode, nomer 1 adalah  " + nomer1 + " dan nomer 2 adalah " + nomer2);
    }
    public static void swap(int n1, int n2){
        System.out.println("\tdi dalam swap metodenya");
        System.out.println("\t\t sebelum melakukan swap, n1 adalah" + n1
                + "dan n2 adalah " + n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println(" \t\tsetelah swap, n1 adalah " + n1 + " dan n2 adalah " + n2);
    }
}
