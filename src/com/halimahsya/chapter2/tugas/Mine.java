package com.halimahsya.chapter2.tugas;

import java.util.Scanner;

public class Mine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Enter a degree in Celsius: ");
        double Celsius = input.nextDouble();

        double Fahrenheit = (9 / 5) * (Celsius + 32);
        System.out.println(" Celsius " + " is " +
            Fahrenheit + " in Fahrenheit ");
    }
}