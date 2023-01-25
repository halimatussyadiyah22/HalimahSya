package com.halimahsya.chapter6_methods.tugas;

import java.util.Scanner;

public class exercise8_ConversionsBetweenCelsiusAndFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(
                "Celsius    Fahrenheit  |   Fahrenheit  Celsius\n" );
        for ( double celsius = 40.0, fahrenheit =  120.0; celsius >= 31.0; celsius--, fahrenheit -= 10){
            System.out.printf("%-12.1f", celsius);
            System.out.printf("%-15.1f|", celsiuskeFahrenheit(celsius));
            System.out.printf("     %-15.1f", fahrenheit);
            System.out.printf("%-7.2f\n\n", fahrenheitkecelsius(fahrenheit));

        }


    }
    public static double celsiuskeFahrenheit(double celsius){
        return (9.0/5)* celsius + 32;
    }
    public static double fahrenheitkecelsius(double fahrenheit){
        return (5.0 / 9)* (fahrenheit - 32);
    }
}
