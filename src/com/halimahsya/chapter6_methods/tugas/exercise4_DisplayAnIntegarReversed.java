package com.halimahsya.chapter6_methods.tugas;

import java.util.Scanner;

public class exercise4_DisplayAnIntegarReversed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" tampilan dan bilangan bulat terbalik : ");
        System.out.println(" masukan sebuah bilangan : ");
        int nomer = input.nextInt();

        membalikan(nomer);

    }
    public static  void  membalikan(int nomer){
        while (nomer > 0){
            System.out.println((nomer % 10 ));
            nomer /= 10;
        }
        System.out.println();
    }
}
