package com.halimahsya.chapter12_ExceptionHnadlingAndText_IO.latihan;

import java.util.Scanner;

public class Listing4_QuotientWithException {
    public static int quotient(int number1, int number2){
        if (number2 == 0)
            throw  new ArithmeticException(" pembagi tidak bisa menjadi 0 ");
        return  number1/number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" masukan dua bilangan : " );
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            int result = quotient(number1,number2);
            System.out.println(number1 + " / " + number2 + " adalah " + result);
        }
        catch (ArithmeticException ex){
            System.out.println(" pengecualian : bilangan " + " cannot be divided by zero ");
        }
        System.out.println("eksekusi berlanjut.....");
    }
}
