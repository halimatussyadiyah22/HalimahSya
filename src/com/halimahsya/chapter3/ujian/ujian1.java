package com.halimahsya.chapter3.ujian;

import java.util.Scanner;

public class ujian1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String jk;
        double broca;
        System.out.print("masukan jenis kelamin (L/P ) = ");
        jk = input.nextLine();
        System.out.print("masukan tinggi badan = ");
        double tb = input.nextDouble();
        System.out.print("masukan berat badan = ");
        double bb = input.nextDouble();
        double a = tb - 100;
        double b = tb - 100;


        broca=0;
        switch( jk ){
            case "L" : System.out.print("jenis kelamin anda adalah laki-laki");
                broca  = (tb - 100) - (a * 0.1);
                break;
            case "P" : System.out.print("jenis kelamin anda adalah perempuan");
                broca = (tb - 100) - ( b * 0.15);
                break;
            default : broca =0;

        }
        System.out.println(" maka berat badan ideal anda adalah " + broca);

        double tbm = tb / 100;

        double c = tbm * tbm;

        double BMI = bb / c;

        System.out.println(" Nilai BMI anda adalah " + BMI);


        if (BMI <= 18.5)
            System.out.println(" maka kategori tubuh anda adalah kurus ");
        else if(BMI <= 24.9)
            System.out.println(" maka kategori tubuh anda adalah normal ");
        else if (BMI <= 29.9)
            System.out.println(" maka kategori tubuh anda adalah kelebihan berat badan ");
        else if (BMI > 30 )
            System.out.println(" maka kategori tubuh anda adalah obesitas ");




    }
}


