package com.halimahsya.chapter2.tugas;

import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println(" Enter the number of minute: ");
    int minutes = input.nextInt();

    int years = minutes / 525600;
    int days = ( minutes % 525600) / 1440;

    System.out.println( minutes + "minutes is approximately" 
        + years + " years and " + days + " days ");

    }
}
