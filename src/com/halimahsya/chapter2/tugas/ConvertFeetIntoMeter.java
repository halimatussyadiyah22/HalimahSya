package com.halimahsya.chapter2.tugas;

import java.util.Scanner;
public class ConvertFeetIntoMeter {
    public static void main(String[] args) {

    final double feettometers = 0.305;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a value for feet: ");
    double value = input.nextDouble();
    double meters = value/feettometers;
    
    System.out.println(value + " feet is " + meters );
    }
}
