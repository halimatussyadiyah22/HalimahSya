package com.halimahsya.chapter4.latihan;

import java.util.Scanner;

public class hexagon {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        double s ,area;
        System.out.println(" masukan sisinya = ");
        s = input.nextDouble();

        area =  (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI/6));

        System.out.printf(" area nya hexagon adalah %4.2f\n", area);

    }
}
