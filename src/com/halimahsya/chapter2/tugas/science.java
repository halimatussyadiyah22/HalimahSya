package com.halimahsya.chapter2.tugas;

import java.util.Scanner;

public class science {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan air dalam kilogram: ");
        double kilogram = input.nextDouble();

        System.out.print("masukan inisial temperatur: ");
        double inisialTemperatur = input.nextDouble();

        System.out.print("masukan final tempetur: ");
        double finalTemperatur = input.nextDouble();

        double energy = kilogram * (finalTemperatur - inisialTemperatur) * 4184;

        System.out.println("The energy needed is " + energy);

    }
    
}
