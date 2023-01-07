package com.halimahsya.chapter4.latihan;

import java.util.Scanner;

public class polygon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int s;
        double side,area;
        System.out.println(" masukan nomer sisinya = ");
        s = input.nextInt();
        System.out.println("masukan jumlah sisinya = ");
        side = input.nextDouble();

        area = (s * Math.pow(side,2)/(4* Math.tan(Math.PI / s)));

        System.out.println(" area poligon adalah " + area );




    }
}
