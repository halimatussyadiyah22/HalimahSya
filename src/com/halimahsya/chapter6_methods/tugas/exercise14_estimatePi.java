package com.halimahsya.chapter6_methods.tugas;

public class exercise14_estimatePi {
    public static void main(String[] args) {
        double start = 1, end = 901;
        System.out.println("\ni         m(i)    ");
        System.out.println("------------------------");
        for (double i = start; i <= end; i += 100){
            System.out.printf("%-12.0f", i);
            System.out.printf("%-6.4f\n", estimatepi(i));
        }

    }
    public static double estimatepi(double n){
        double pi =0;
        for (double i = 1; i <= n; i++){
            pi += Math.pow(-1, i +1)/(2* i - 1);
        }
        pi *= 4;
        return pi;
    }
}
