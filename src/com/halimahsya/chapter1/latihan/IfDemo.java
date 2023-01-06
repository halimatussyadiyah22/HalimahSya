package com.halimahsya.chapter1.latihan;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integar : ");
    int number = input.nextInt();

    if (number % 5 == 0)
    System.out.println("HiFive");
    if (number % 2 == 0)
    System.out.println("HiEven");
    } 
}
