package com.halimahsya.chapter6_methods.tugas;

import java.util.Scanner;

public class exercise25_ConvertMilliSecondToHoursmAnds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" masukan milliseconds : ");
        long millis = input.nextLong();

        System.out.println(" jam:menit:detik: " + convertMillis(millis));

    }

    public static String convertMillis(long millis) {
        millis /= 1000;
        String currentMinuteAndSecond = "";
        for (int i = 0; i < 2; i++) {
            currentMinuteAndSecond = ":" + millis % 60 + currentMinuteAndSecond;
            millis /= 60;
        }
        return millis + currentMinuteAndSecond;

    }
}
