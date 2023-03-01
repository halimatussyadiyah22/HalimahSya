package com.halimahsya.chapter12_ExceptionHnadlingAndText_IO.latihan;

import java.util.Scanner;

public class Listing1_Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan 2 bilangan : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println(number1 + " / " + number2 + " adalah " + (number1/number2));
    }
}
