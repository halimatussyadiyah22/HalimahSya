package com.halimahsya.chapter5.tugas;

import java.util.Scanner;

public class excercise14_HitungPembagianPersekutuanTerbesar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1,n2,gcd;
        System.out.print(" masukan bilangan pertama : ");
        n1 = input.nextInt();
        System.out.print(" masukan bilangan kedua : ");
        n2 = input.nextInt();

        gcd = n1 < n2 ? n1 : n2;

        while (n1 % gcd != 0 || n2 % gcd != 0){
            gcd--;
        }
        System.out.println(" pembagi persekutuan terbesar untuk " + n1 + " dan "
        + n2 + " adalah " + gcd);



    }
}
