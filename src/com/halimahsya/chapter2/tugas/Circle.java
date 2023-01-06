package com.halimahsya.chapter2.tugas;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final double PI = 22/7;

        System.out.println("Masukan nilai radius dan length: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println( " hasil area silinder  adalah " + area);
        System.out.println(" hasil volume silinder adalah " + volume);

    }
}