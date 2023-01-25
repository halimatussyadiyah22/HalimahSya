package com.halimahsya.chapter6_methods.tugas;

import java.util.Scanner;

public class exercise20_countTheLetterInAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" masukan string : ");
        String string = input.nextLine();

        System.out.println(" nomer dari angka di string \""
                + string + "\":" + countLetters(string));

    }
    public static int countLetters( String s ){
        int numberOfLetters = 0;
        for(int i = 0; i < s.length(); i++){
            if (Character.isLetter(s.charAt(i)))
                numberOfLetters++;
        }
        return numberOfLetters;
    }
}
