package com.halimahsya.chapter4.latihan;
import java.util.Scanner;
public class pentagon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double r,s,area,a;
        System.out.println(" masukan panjang dari pusat ke simpul = ");
        r = input.nextDouble();


        a = (2*r);
        s = a * Math.sin(Math.PI / 5);
        area = ( 5 * Math.pow(s,2)) / ( 4* Math.tan(Math.PI/5));
        System.out.printf(" area pentagonnya  adalah %5.2f", area);
    }
}
