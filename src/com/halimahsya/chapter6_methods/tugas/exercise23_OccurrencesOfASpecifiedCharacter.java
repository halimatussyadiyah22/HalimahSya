package com.halimahsya.chapter6_methods.tugas;

import java.util.Scanner;

public class exercise23_OccurrencesOfASpecifiedCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" masukan sebuah string mengikuti dari karakter e.g. welcome, e: ");
        String string = input.nextLine();

        int k = string.indexOf(", ");
        String str = string.substring(0,k);
        char ch = string.charAt(k+2);

        System.out.println(" nomer akuran dari\"" + ch + "\" in\'" + "\"is:" + count(str,ch));

    }
    public static int count(String str, char a){
        int count = 0;
        for(int i =0; i < str.length(); i++){
            if (a == str.charAt(i))
                count++;
        }
        return  count;
    }
}
