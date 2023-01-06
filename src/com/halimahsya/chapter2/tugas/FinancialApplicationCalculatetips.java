package com.halimahsya.chapter2.tugas;

import java.util.Scanner;
public class FinancialApplicationCalculatetips {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = subtotal * gratuityRate;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity +
        " and total is $ " + total);

    }
}