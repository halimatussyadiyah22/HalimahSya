package com.halimahsya.chapter4.latihan;

import java.util.Scanner;

public class Haribulan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int b ;
        System.out.println(" masukan bulan = ");
        String bulan = input.nextLine();
        System.out.println(" masukan tahun = ");
        int tahun = input.nextInt();




        b = 0;
        switch(bulan) {
            case "januari":
            case "maret":
            case "mei":
            case "juli":
            case "agustus":
            case "oktober":
            case "desember":
                b = 31;
                break;
            case " april":
            case "juni":
            case "september":
            case "november":
                b = 30;
                break;
            case "februari":
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    b = 29;
                } else
                    b = 28;
                break;
        }

             System.out.println( bulan +  tahun  + " itu mempunyai " + b + " hari ");

    }
}
