package com.halimahsya.chapter5.latihan;

import java.util.Scanner;

public class Listing5_sentinevalue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" masukan sebuah bilangan bulat (masukan berakhir jika itu adalah  0) = ");
        int data = input.nextInt();
        int sum = 0;
        while (data != 0 ){
            sum += data;

            System.out.println(" masukan sebuah bilangan bulat (input berakhir jika itu 0) = ");
            data = input.nextInt();
        }
        System.out.println("jumlah adalah " + sum );

    }
}
