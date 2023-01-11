package com.halimahsya.chapter5.tugas;

public class excercise13_menemukanTerbesar {
    public static void main(String[] args){
        int n = 0;

        while (Math.pow(n + 1,3) < 12000){
            n++;
        }
        System.out.println(" bilangan terbesar n sehingga n ^3 lebih kecil dari 12.000 : " + n);

    }
}
