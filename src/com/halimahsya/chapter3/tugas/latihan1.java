package com.halimahsya.chapter3.tugas;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan nilai a= ");
        double a = input.nextDouble();
        System.out.print("masukan nilai b= ");
        double b = input.nextDouble();
        System.out.print("masukan nilai c= ");
        double c = input.nextDouble();


        double d = Math.pow(Math.pow(b,2) - 4*a*c,0.5);
        double e = -b + d;
        double r1 = e/2*a;
        double g = Math.pow(Math.pow(b,2) - 4*a*c,0.5);
        double h =  -b - g;
        double r2 = h / 2*a;


        if ( d >= 1 && g >= 1 )
            System.out.print("the equation has two roots = " + r1 + " & " + r2 );
        if ( d == 0 && g == 0 )
            System.out.print("the equation has one root = " + r1 );
        if ( d < 0 && g < 0 )
            System.out.print(" the equation has not real roots " );

    }
}
