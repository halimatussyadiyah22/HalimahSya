package com.halimahsya.chapter2.tugas;

import java.util.Scanner;
public class akselerasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan v0, v1 dan t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double a = (v1 - v0) / t;

        System.out.println(" rata-rata dari akselerasi adalah " 
            + a);


    }
    
}
