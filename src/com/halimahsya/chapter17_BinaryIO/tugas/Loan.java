package com.halimahsya.chapter17_BinaryIO.tugas;

import java.util.Date;

public class Loan implements java.io.Serializable{
    private double annualInterestRate,loanAmount;
    private int numberOfYears;
    private java.util.Date loanDate;

    public Loan(){
        this(2.5,1,1000);
    }
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public double getMontlhlyPayment(){
        double monthlyInterestRate= annualInterestRate/1200;
        double monthlyPayment = loanAmount*monthlyInterestRate/
                (1 -(1/Math.pow(1+ monthlyInterestRate,numberOfYears*12)));
        return  monthlyPayment;
    }
    public double getTotalPayment(){
        double totalPayment = getMontlhlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    @Override
    public String toString() {
        return "Date: " + loanDate + "\nAnnual interest Rate: " +
                annualInterestRate + "\nYears: " + numberOfYears +
                "\nLoan amount: " + loanAmount;
    }
}
