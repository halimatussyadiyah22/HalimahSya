package com.halimahsya.chapter6_methods.latihan;

public class Listing1_tesmaks {
    public static void main(String[] args){
        int i = 5, j = 2 ;
        int k = max(i,j);
        System.out.println(" maksimal dari " + i + " dan " + j + "adalah" + k);
    }
    public static int max(int nomer1 ,int nomer2){
        int result;
        if (nomer1 > nomer2)
            result = nomer1;
        else
            result = nomer2;
        return result;
    }
}
