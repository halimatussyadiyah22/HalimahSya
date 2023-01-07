package com.halimahsya.chapter4.latihan;
import java.util.Scanner;
public class character {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" masukan kode ASCII = ");
        int i = input.nextInt();

        System.out.println("karakter untuk ASCII code " + i + " adalah " + (char)i);

    }
        }
