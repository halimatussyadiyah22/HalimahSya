package com.halimahsya.chapter5.latihan;

import java.util.Scanner;

public class Listing9_greatestCommonDivisor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print(" masukan bilangan pertama: ");
        int n1 = input.nextInt();
        System.out.print(" masukan bilangan pertama: ");
        int n2 = input.nextInt();

        int gcd =1;
        int k = 2;
        while (k <= n1 && k <= n2){
            if(n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }
        System.out.println(" Pembagi persekutuan terbesar untuk " + n1 + " dan " + n2 + " adalah " + gcd);
    }
}
