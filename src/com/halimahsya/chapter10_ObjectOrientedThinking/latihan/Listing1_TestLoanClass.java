package com.halimahsya.chapter10_ObjectOrientedThinking.latihan;

import java.util.Scanner;

public class Listing1_TestLoanClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" masukan suku bunga tahunan, untuk contoh, 8.25: ");
        double annualInterestRate = input.nextInt();
        System.out.println(" masukan jumlah dari tahun dalam bilangan : ");
        int numberOfYears = input.nextInt();
        System.out.println(" masukan jumlah pinjaman, untuk contoh, 120000.95: ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf(" pinjaman dibuat dalam %s\n " + " bayaran perbulan adalah %.2f\nTotal pembayaran adalah %.2f\n",
                loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
    }
}
