package com.halimahsya.chapter6_methods.latihan;

public class Listing4_kenaikan {
    public static void main(String[] args){
        int x = 1;
        System.out.println(" sebelum panggilan, x adalah " + x);
        kenaikan(x);
        System.out.println(" sesudah panggilan, x adalah " + x);
    }
    public static void kenaikan( int n){
        n++;
        System.out.println(" di dalam metode n adalah " + n);
    }
}
