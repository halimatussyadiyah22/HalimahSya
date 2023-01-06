package com.halimahsya.chapter2.tugas;

import java.util.Scanner;
    public class sumdigit {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print(" masukan nomer antara 0 dan 1000: ");
            int number = input.nextInt();

            int lessThan10 = number % 10;
            number /= 10;
            int tens = number % 10;
            number /= 10;
            int hundreds = number % 10;
            number /= 10;
            int sum = hundreds + tens + lessThan10;

            System.out.println("sum jumlah digit adalah"
             + sum);

            
        }
    }