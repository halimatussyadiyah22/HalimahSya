package com.halimahsya.chapter13_AbstactClassesAndInterfaces.tugas;

import java.util.Scanner;

public class exercise1_Triangleclass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println(" enter a color: ");
        String color = input.next();

        System.out.println(" is the triangle filled (true / false )?");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(side1,side2, side3 , color,filled);

        System.out.println(triangle);
    }
}
