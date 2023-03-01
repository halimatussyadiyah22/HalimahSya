package com.halimahsya.chapter12_ExceptionHnadlingAndText_IO.latihan;

import java.util.Scanner;

public class Listing3_QuotientWithMethod {
    public static  int quotient(int number1 , int number2){
        if (number2 == 0){
            System.out.println("pembagi tidak bisa menjadi 0 ");
            System.exit(1);
        }
        return number1/number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" masukan 2 bilangan : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int result = quotient(number1,number2);
        System.out.println(number1 + " / " + number2 + " adalah " + result);
    }
}
