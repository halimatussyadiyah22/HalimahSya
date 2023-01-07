package com.halimahsya.chapter4.latihan;

import java.util.Scanner;

public class proccesString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan string : ");
        String str = input.nextLine();
        System.out.println(str + " mempunyai panjang yaitu " + str.length() +
                " dan karakter pertama adalah " + str.charAt(0));
    }
}
