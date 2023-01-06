package com.halimahsya.chapter5.tugas;

public class knmilestokilometer {
    public static void main(String[] args){
        final double kmpermile = 1.609;

        System.out.println(" miles      kilometer   |   kilometers   miles   ");
        for(int m = 1, k = 20; m <= 10 && k <= 65; m++, k += 5){
            System.out.printf( " %-11d%-10.3f", m, (m * kmpermile));
            System.out.print("  |   ");
            System.out.printf( "%-15d%-6.3f\n", k, (k/ kmpermile));
        }
    }
}
