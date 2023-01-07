package com.halimahsya.chapter5.latihan;

public class tespenjumlahan {
    public static void main(String[] args){
        float sum = 0;

        for (float i = 0.01f; i <= 1.0f; i = i + 0.01f)
            sum += i;

        System.out.println(" jumlahnya adalah " + sum);
    }
}
