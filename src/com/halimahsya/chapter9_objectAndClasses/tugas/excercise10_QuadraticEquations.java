package com.halimahsya.chapter9_objectAndClasses.tugas;

import java.util.Scanner;

public class excercise10_QuadraticEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a,b,c : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquations quadraticEquations = new QuadraticEquations(a,b,c);

        System.out.print(" the equation has ");
        if (quadraticEquations.getDiscriminant()<0)
            System.out.println("no real roots");
        else if (quadraticEquations.getDiscriminant() >0){
            System.out.println(" two roots " + quadraticEquations.getRoot1() + " and " + quadraticEquations.getRoot2());
        }
        else {
            System.out.println("one root " + (quadraticEquations.getRoot1() > 0 ?
                    quadraticEquations.getRoot1() : quadraticEquations.getRoot2()));
        }
    }
}
