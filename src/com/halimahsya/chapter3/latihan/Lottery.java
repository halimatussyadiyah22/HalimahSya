package com.halimahsya.chapter3.latihan;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args){

    int Lottery = (int)(Math.random() *100);

    Scanner input = new Scanner(System.in);
    System.out.print("enter your lottery pick (two digit): ");
    int guess = input.nextInt();

    int lotteryDigit1 = Lottery / 10;
    int lotteryDigit2 = Lottery % 10;

    int guessDigit1 = guess / 10;
    int guessDigit2 = guess % 10;

    System.out.println("the lottery number is " + Lottery);

    if(guess == Lottery)
    System.out.println("exact match : you win $10,000 ");
    else if(guessDigit2 == lotteryDigit1
        && guessDigit1 == lotteryDigit2)
    System.out.print("match all digits : you win $3,000 ");
    else if (guessDigit1 == lotteryDigit1
            || guessDigit1 == lotteryDigit2
            || guessDigit2 == lotteryDigit1
            || guessDigit2 == lotteryDigit2)
        System.out.println("match one digit : you win $1,000");
    else 
    System.out.println("sorry, no much");   

    }
}
