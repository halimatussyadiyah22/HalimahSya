package com.halimahsya.chapter6_methods.tugas;

import java.util.Scanner;

public class exercise22_ApproximateTheSquareRoof {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" masukan nomer :");
        long number = input.nextLong();

        System.out.println( " akar kuadrat yang didekati dari " + number + " adalah : " + sqrt(number));

    }
    public static  double sqrt(long n){
        long lastguess = 1;
        long nextguess = (lastguess + n/ lastguess)/ 2;
        while ( nextguess - lastguess > 0.0001){
            lastguess = nextguess;
            nextguess = (lastguess + n / lastguess)/2;
        }
        lastguess = nextguess;
        return nextguess = ( lastguess + n / lastguess)/2;
    }
}
