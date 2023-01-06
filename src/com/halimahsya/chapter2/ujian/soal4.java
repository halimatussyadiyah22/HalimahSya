package com.halimahsya.chapter2.ujian;

import java.util.Scanner;
public class soal4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan berat= ");
        double bb = input.nextDouble();
        System.out.print("masukan tinggi badan= ");
        double tb = input.nextDouble();
        double tbm = tb/100;

        double a = (tb-100);
        double b = 0.15* a;
        double BROCA = a-b;

        
        double BMI = bb / Math.pow(tbm,2);



        System.out.println( " Berat badan ideal anda adalah " + BROCA );
        System.out.println( " TInggi BMI anda adalah " + BMI );

         


        
    }
}
