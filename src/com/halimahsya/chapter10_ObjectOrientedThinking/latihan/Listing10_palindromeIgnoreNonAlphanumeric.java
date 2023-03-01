package com.halimahsya.chapter10_ObjectOrientedThinking.latihan;

import java.io.StringReader;
import java.util.Scanner;

public class Listing10_palindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" masukan string : ");
        String s = input.nextLine();

        System.out.println(" Mengabaikan karakter nonalfanumerik, \nis " + s + " sebuah palindrome ?" + isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        String s1 = filter(s);
        String s2 = reverse(s1);
        return  s2.equals(s1);
    }
    public static String filter(String s ){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (Character.isLetterOrDigit(s.charAt(i))){
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
    public static String reverse(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
