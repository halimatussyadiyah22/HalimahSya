package com.halimahsya.chapter12_ExceptionHnadlingAndText_IO.latihan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Listing5_InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.println(" masukan bilangan : ");
                int number = input.nextInt();

                System.out.println(" nomer yang di masukan adalah " + number);
                continueInput = false;
            }
            catch (InputMismatchException ex){
                System.out.println("coba lagi. ( " + "input yang salah: bilangan itu dibutuhkan )");
                input.nextInt();
            }
        }while (continueInput);
    }
}
