package com.halimahsya.chapter6_methods.ujian;

import java.util.Scanner;

public class ujian1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(
                "\ninch     meter         |         inch    meter\n" +
                        "-----------------------------------------");
        for ( double inch = 1.0, meter = 1.0;
              inch <= 100;inch++,meter++){
            System.out.printf("%4.1f    ", inch);
            System.out.printf("%6.3f", inchkemeter(inch));
            System.out.print("         |       ");
            System.out.printf("%-6.1f  ",meter);
            System.out.printf("%7.4f\n",meterkeinch(meter));
        }
    }
    public static double inchkemeter(double inch ){

        return inch * 0.0254;
    }
    public static double meterkeinch(double meter){

        return meter* 39.3701;
    }
}
