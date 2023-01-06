package com.halimahsya.chapter2.ujian;

import java.util.Scanner;
public class soal1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan as ts dan tp");
        double AS = input.nextDouble();
        double TS = input.nextDouble();
        double TP = input.nextDouble();

        System.out.print("masukan nilai a dan b");
        double s= AS/2;
        double a = Math.pow(s,2);
        double b = Math.pow(TS,2);
        double c = a+b;
        double d = Math.pow(c,0.5);
        double KS = 2*d+AS;

        double ab = (0.5*AS);
        double ac = ab*TS;
        double V = ac*TP;


        double bc = (2*0.5);
        double cd = bc*AS;
        double ce = cd*TS;
        double ad = KS*TP;
        double LP = ce+ad;

        System.out.println(" hasil nilai voulume adalah " + " V " + V );
        System.out.println("hasil nilai luas permukaan adalah" + " LP " + LP );
    }
  
}
