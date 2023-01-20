package com.halimahsya.chapter6_methods.latihan;

import java.util.Scanner;

public class Listing8_Hex2Dec {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println(" masukan nomer hex");
        String hex = input.nextLine();

        System.out.println(" nilai desimal untuk nomer hex " + hex + " adalah "
                + HextkeDesimal(hex.toUpperCase()));
    }
    public static int HextkeDesimal( String hex ){
        int nilaiDesmial = 0;
        for (int i =0; i< hex.length(); i++){
            char hexChar = hex.charAt(i);
            nilaiDesmial = nilaiDesmial * 16 + hexCharKeDesimal(hexChar);
        }
        return  nilaiDesmial;
    }
    public static  int hexCharKeDesimal(char ch){
        if (ch >= 'A' && ch <= 'F')
            return 10+ ch - 'A';
        else
            return  ch - '0';
    }
}
