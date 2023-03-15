package com.halimahsya.chapter9_objectAndClasses.tugas;

import java.util.Scanner;

public class excercise11_linearEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a,b,c,d,e,f");
        double a =  input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();


        LinearEquations linearEquations = new LinearEquations(a,b,c,d,e,f);

        if (linearEquations.isSolvable()) {
            System.out.println("x is " + linearEquations.getX() + " and y is " + linearEquations.getY());
        }
        else
            System.out.println(" the equation has no solution.");
    }
}
