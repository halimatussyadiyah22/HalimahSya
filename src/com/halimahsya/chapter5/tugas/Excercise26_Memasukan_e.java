package com.halimahsya.chapter5.tugas;

public class Excercise26_Memasukan_e {
    public static void main(String[] args){
        double e,nilai,i,k,denominator;
        e = 0.0;
        nilai = 10000.0;
        for ( i = 1; i <= nilai; i++){
            denominator = i;
            for( k = i - 1; k >= 1; k--){
                denominator *= k;
            }
            e += 1 / denominator;
        }
        System.out.println(" nilai e untuk i = 10000: " + e);

        e = 0.0;
        nilai = 20000.0;
        for ( i = 1; i <= nilai; i++){
            denominator = i;
            for( k = i - 1; k >= 1; k--){
                denominator *= k;
            }
            e += 1 / denominator;
        }
        System.out.println(" nilai e untuk i = 20000: " + e);

        e = 0.0;
        nilai = 100000.0;
        for ( i = 1; i <= nilai; i++){
            denominator = i;
            for( k = i - 1; k >= 1; k--){
                denominator *= k;
            }
            e += 1 / denominator;
        }
        System.out.println(" nilai e untuk i = 100000: " + e);

    }
}
