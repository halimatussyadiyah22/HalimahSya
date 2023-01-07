package com.halimahsya.chapter4.latihan;
import java.util.Scanner;
public class randomcha {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 65 + (int)(Math.random() * (91 - 65));

        System.out.println((char)(number));
    }
}
