package com.halimahsya.chapter5.latihan;

import java.util.Scanner;

public class Listing14_palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" masukan string = ");
        String s = input.nextLine();

        int low = 0;
        int high = s.length()- 1;

        boolean ispalindrome = true;
        while (low < high){
            if(s.charAt(low) != s.charAt(high)){
                ispalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if (ispalindrome)
            System.out.println(s + " adalah sebuah palindrom");
        else
            System.out.println(s + " adalah bukan palindrom ");
    }
}
