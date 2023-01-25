package com.halimahsya.chapter6_methods.tugas;

public class exercise16_NumberOfDaysInAYear {
    public static void main(String[] args) {
        System.out.println("year        Days in year");
        for (int year = 2000; year <= 2020; year++){
            System.out.println(year+"       " + numberOfDaysInAyear(year));
        }

    }
    public static int numberOfDaysInAyear(int year){
        if (isLeapYear(year))
            return 366;
        else
            return 365;
    }
    public static boolean isLeapYear(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

}
