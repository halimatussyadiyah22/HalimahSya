package com.halimahsya.chapter3.tugas;

import java.util.Scanner;

public class funsi {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x,f;
        System.out.println(" masukan nilai x =");
        x = input.nextDouble();


        f = (x + 2) * x;

        System.out.println(" fungsi dari f(x) adalah " + f);


    }
}
