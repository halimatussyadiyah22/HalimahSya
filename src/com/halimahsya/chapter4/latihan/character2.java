package com.halimahsya.chapter4.latihan;
import java.util.Scanner;
public class character2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" masukan karakter huruf = ");
        String s = input.nextLine();

        char ch = s.charAt(0);

        System.out.println(" unicode untuk karakter " + s + " adalah " + (int)ch );

    }
}
