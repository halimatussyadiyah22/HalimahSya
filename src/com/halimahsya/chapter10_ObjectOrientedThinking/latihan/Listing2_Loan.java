package com.halimahsya.chapter10_ObjectOrientedThinking.latihan;

public class Listing2_Loan {
    private double annualInterestRate,loanAmount;
    private int numberOfYears;
    private java.util.Date loanDate;

    public Listing2_Loan(){
        this(2.5,1,1000);
    }
    public Listing2_Loan(double annualInterestRate,int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(){
        this.annualInterestRate = annualInterestRate;
    }
    public int getNumberOfYears(){
        return numberOfYears;
    }
    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }
    public double getLoanAmount(){
        return loanAmount;
    }
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }
    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount*monthlyInterestRate/(1 - (1/ Math.pow(1+ monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }
    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
    public java.util.Date getLoanDate(){
        return loanDate;
    }
}
