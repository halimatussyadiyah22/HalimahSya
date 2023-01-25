package com.halimahsya.chapter5.latihan;

public class Listing13_TestContinue {
    public static void main(String[] args){
        int sum = 0, nomer = 0;
        while (nomer < 20){
            nomer++;
            if (nomer == 10 || nomer == 11)
                continue;
            sum += nomer;
        }
        System.out.println(" jumlahnya adalah " + sum);
    }
}
