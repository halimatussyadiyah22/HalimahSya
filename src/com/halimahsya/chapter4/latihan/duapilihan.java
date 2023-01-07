package com.halimahsya.chapter4.latihan;

import java.util.Scanner;

public class duapilihan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" masukan angka = ");
        String S = input.nextLine();
        char ch= S.charAt(0);

        if(Character.isLetter(ch)){
            switch ((Character.toUpperCase(ch))){
                case 'A':
                case 'I':
                case 'E':
                case 'O' :
                    case 'U' : System.out.println(ch + " adalah huruf vokal");
                    break;
                default: System.out.println( ch + " adalah huruf konsonan ");

            }
        }

        else
            System.out.println(ch + " adalah huruf yang tidak valid");
    }
}





