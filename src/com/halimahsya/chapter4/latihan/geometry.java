package com.halimahsya.chapter4.latihan;
import java.util.Scanner;
public class geometry {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String xy1,xy2;
        double x1,y1,x2,y2,distance;
        int k;
        final double radius = 6371.01;
        System.out.println("masukan poin 1( garis lintang dan garis bujur) dalam derajat: ");
        xy1 = input.nextLine();
        System.out.println("masukan poin 2( garis lintang dan garis bujur) dalam derajat: ");
        xy2 = input.nextLine();

        k = xy1.indexOf(',');

        x1 = Double.parseDouble(xy1.substring(0,k - 1));
        y1 = Double.parseDouble(xy1.substring(k+2));
        x2 = Double.parseDouble(xy2.substring(0,k- 1));
        y2 = Double.parseDouble( xy2.substring(k + 2));

        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        distance = radius * Math.acos(Math.sin(x1) * Math.sin(x2)
                + Math.cos(x1) *  Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println(" jarak di antara 2 poin adalah " + distance );
    }
}
