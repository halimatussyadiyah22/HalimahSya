package com.halimahsya.chapter5.ujian;

import java.util.Scanner;

public class soal1_corr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("_____________MENU________________");
        System.out.println("A. menghitung biner menjadi oktal");
        System.out.println("B. menghitung biner menjadi desimal");
        System.out.println("C. menghitung biner menjadi heksa ");
        System.out.println("D. menghitung oktal menjadi biner ");
        System.out.println("E. menghitung oktal menjadi desimal ");
        System.out.println("F. menghitung oktal menjadi heksa ");
        System.out.println("G. menghitung desimal menjadi biner ");
        System.out.println("H. menghitung desimal menjadi oktal ");
        System.out.println("I. menghitung desimal menjadi heksa ");
        System.out.println("J. menghitung heksa menjadi biner ");
        System.out.println("K. menghitung heksa menjadi oktal ");
        System.out.println("L. menghitung heksa menjadi desimal ");
        System.out.println("====================================");

        System.out.print(" masukan menu yang anda inginkan = ");
        String menu = input.nextLine();

        switch (menu) {
            case "A":
                System.out.println("menghitung biner menjadi oktal" +
                        " maka masukan angka biner = ");
        }
    }
}
