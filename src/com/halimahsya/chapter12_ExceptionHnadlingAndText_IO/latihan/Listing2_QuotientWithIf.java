package com.halimahsya.chapter12_ExceptionHnadlingAndText_IO.latihan;

import java.util.Scanner;

public class Listing2_QuotientWithIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" masukan 2 bilangan : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if(number2 != 0)
            System.out.println(number1 + " / " + number2 + " adalah " + (number1/number2));
        else
            System.out.println(" pembagi tidak bisa menjadi 0 ");
    }
}
