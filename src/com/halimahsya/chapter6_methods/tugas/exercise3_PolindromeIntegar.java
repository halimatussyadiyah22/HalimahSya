package com.halimahsya.chapter6_methods.tugas;

import java.util.Scanner;

public class exercise3_PolindromeIntegar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println( " masukan bilangan : ");
        int nomer = input.nextInt();
        System.out.println( nomer + (isPalindrome(nomer) ? " adalah " : " adalah bukan ") + " sebuah palindrome ");
    }
    public static  boolean isPalindrome(int nomer){
        return nomer == reverse(nomer) ? true : false;
    }
    public static  int reverse (int nomer){
        String membalikan = "";
        String n = nomer + "";
        for ( int i = n.length() - 1; i >= 0; i--){
            membalikan += n.charAt(i);
        }
        return Integer.parseInt( membalikan );
    }
}
