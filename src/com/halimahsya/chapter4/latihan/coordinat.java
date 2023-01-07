package com.halimahsya.chapter4.latihan;
import java.util.Scanner;
public class coordinat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius,x,y;
        System.out.println(" masukan radius pembatas lingkaran =  ");
        radius = input.nextDouble();
        input.close();

        System.out.println(" koordinat dari 5 poin dalam pentagon adalah : ");
        for (int i = 0; i < 5; i++){

            x = (radius* Math.sin(2.0 * Math.PI / 5.0 * i));
            y = (radius* Math.cos(2.0 * Math.PI / 5.0 * i));
            System.out.println((x) + " " + (y));
        }
    }

}
