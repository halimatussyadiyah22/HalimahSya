package com.halimahsya.chapter3.latihan;

import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("enter a year : ");
        int year = input.nextInt();

        boolean isLeapYear =
        (year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0);
    
    System.out.println(year + " is a leapyeear? " + isLeapYear );
    
    }
    
}
