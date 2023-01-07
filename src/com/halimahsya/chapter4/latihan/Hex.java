package com.halimahsya.chapter4.latihan;
import java.util.Scanner;
public class Hex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("masukan nilai desimal ( 0 - 15 ) : ");
        int desimal = input.nextInt();
        if (desimal >= 0 && desimal <= 9)
            System.out.println("nilai hexnya adalah " + desimal);
        else if( desimal >= 10 && desimal <= 15)
            System.out.println(" nilai hexnya adalah " + (char)(desimal + 'A' - 10));
        else
            System.out.println(desimal + " adalah nomer tidak valid ");
    }
}
