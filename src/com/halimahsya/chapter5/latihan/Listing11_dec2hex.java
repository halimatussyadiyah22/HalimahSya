package com.halimahsya.chapter5.latihan;

import java.util.Scanner;

public class Listing11_dec2hex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println(" masukan angka desimal = ");
        int des = input.nextInt();

        String hex = "";

        while (des != 0){
            int nilHex = des % 16;

            char hexdigit = (nilHex <= 9 && nilHex >= 0)?
                    (char)(nilHex + '0') : (char) (nilHex - 10 + 'A');

            hex = hexdigit + hex;

            des = des /16;
        }
        System.out.println(" nomer hex adalah " + hex);
    }
}
