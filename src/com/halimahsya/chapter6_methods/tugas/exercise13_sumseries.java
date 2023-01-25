package com.halimahsya.chapter6_methods.tugas;

public class exercise13_sumseries {
    public static void main(String[] args) {
        double seriesStart = 1.0;
        double numberOfRows = 20.0;

        System.out.println("\ni         m(i)    ");
        System.out.println("-----------------------");

        for (double i = seriesStart; i <= numberOfRows; i++){
            System.out.printf("%-10.0f", i);
            System.out.printf("%7.4f\n", sumseries(i));
        }
    }
    public static double sumseries(double n){
        double sum = 0;
        for (double i = 1; i <= n; i++){
            sum += i/(i + 1);
        }
        return sum;
    }
}
