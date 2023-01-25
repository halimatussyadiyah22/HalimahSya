package com.halimahsya.chapter6_methods.tugas;

import java.util.Scanner;

public class exercise9_ConversionBetweenFeetAndMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(
                "\nkaki     Meter   |   meter   kaki\n" +
                        "---------------------------------------");
        for (double kaki = 1.0,meter = 20.0;
        kaki <= 10.0;
        kaki++, meter += 5){
            System.out.printf("%4.1f    ", kaki);
            System.out.printf("%6.3f", kakikemeter(kaki));
            System.out.print("    |   ");
            System.out.printf("%-11.1f", meter);
            System.out.printf("%7.3f\n", meterkekaki(meter));

        }
    }

    public static double kakikemeter(double kaki) {
        return 0.305 * kaki;
    }

    public static double meterkekaki(double meter) {
        return 3.279 * meter;
    }
}

