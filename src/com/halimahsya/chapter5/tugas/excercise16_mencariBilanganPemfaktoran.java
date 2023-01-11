package com.halimahsya.chapter5.tugas;

import java.util.Scanner;

public class excercise16_mencariBilanganPemfaktoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" masukan bilangan : ");
        int nomer = input.nextInt();
        int index = 2;

        while ( nomer / index != 1){
            if (nomer % index == 0){
                System.out.print(index + ", ");
                nomer /= index;
            }
            else
                index++;
        }
        System.out.println(nomer + ".");
    }


}
