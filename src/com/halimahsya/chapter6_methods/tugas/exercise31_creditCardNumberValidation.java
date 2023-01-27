package com.halimahsya.chapter6_methods.tugas;

import java.util.Scanner;

public class exercise31_creditCardNumberValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("  enter a credit number as a long integar : ");
        long number = input.nextLong();

        System.out.println( number + " is " + (isValid(number)? "valid" : "invalid"));

    }
    public static boolean isValid(long number){
        boolean valid = (getsize(number) >= 13 && getsize(number) <= 16)&&
                (prefixMatched(number,4) || prefixMatched(number,5) ||
                        prefixMatched(number,37) || prefixMatched(number,6)) &&
                ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
        return valid;
    }
    public static int sumOfDoubleEvenPlace(long number){
        int sum = 0;
        String num = number + "";
        for (int i = getsize(number) - 2; i >= 0; i -= 2){
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") *2);
        }
        return sum;
    }
    public static  int getDigit(int number){
        if (number < 9)
            return number;
        else
            return  number / 10 + number % 10;
    }
    public static int sumOfOddPlace(long number){
        int sum = 0;
        String num = number + "";
        for (int i = getsize(number) - 1; i >= 0; i -= 2){
            sum += Integer.parseInt(num.charAt(i)+ "");
        }
        return sum;
    }
    public static boolean prefixMatched(long number, int d){
        return getprefix(number,getsize(d)) == d;
    }
    public static int getsize(long d){
        String num = d + "";
        return num.length();
    }
    public static long getprefix(long number, int k){
        if (getsize(number) > k){
            String num = number + "";
            return  Long.parseLong(num.substring(0, k));
        }
        return  number;
    }
}
