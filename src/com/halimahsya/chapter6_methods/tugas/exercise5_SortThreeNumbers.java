package com.halimahsya.chapter6_methods.tugas;

import java.util.Scanner;

public class exercise5_SortThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" masukan 3 nomer : ");
        double nomer1 = input.nextDouble();
        double nomer2 = input.nextDouble();
        double nomer3 = input.nextDouble();

        tampilanSortirNomer( nomer1,nomer2,nomer3);

    }
    public static  void tampilanSortirNomer(double nom1,double nom2,double nom3){
        double temp;

        if (nom2 < nom1 && nom2 < nom3){
            temp = nom1;
            nom1 = nom2;
            nom2 = temp;
        }
        else if (nom3 < nom1 && nom3 < nom2){
            temp = nom1;
            nom1 = nom3;
            nom3 = temp;
        }
        if (nom3 < nom2){
            temp = nom2;
            nom2 = nom3;
            nom3 = temp;
        }
        System.out.println( nom1 +" " + nom2 + " " + nom3);

    }
}


