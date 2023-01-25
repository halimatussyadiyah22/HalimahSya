package com.halimahsya.chapter5.latihan;

import java.util.Scanner;

public class Listing6_testdowhile {
    public static void main(String[] args){
        int data;
        int sum=0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println(" masukan sebuah bilangan bulat ( input akan berakhir jika angka 0 = )");
            data = input.nextInt();

            sum += data;
        }while (data != 0);
            System.out.println( " jumlah adalah " + sum);
    }
}
