package com.halimahsya.chapter5.ujian;

import java.util.Scanner;

public class library {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("_____________MENU________________");
        System.out.println("A. menghitung biner menjadi oktal");
        System.out.println("B. menghitung biner menjadi desimal");
        System.out.println("C. menghitung biner menjadi heksa ");
        System.out.println("D. menghitung oktal menjadi biner ");
        System.out.println("E. menghitung oktal menjadi desimal ");
        System.out.println("F. menghitung oktal menjadi heksa ");
        System.out.println("G. menghitung desimal menjadi biner ");
        System.out.println("H. menghitung desimal menjadi oktal ");
        System.out.println("I. menghitung desimal menjadi heksa ");
        System.out.println("J. menghitung heksa menjadi biner ");
        System.out.println("K. menghitung heksa menjadi oktal ");
        System.out.println("L. menghitung heksa menjadi desimal ");
        System.out.println("====================================");

        System.out.print(" masukan menu yang anda inginkan = ");
        String menu = input.nextLine();

        switch (menu){
        case "A" : System.out.println("menghitung biner menjadi oktal" +
                " maka masukan angka biner = ");
            String biner = input.nextLine();

            int nilaidesimal = Integer.parseInt(biner,2);
            String nilaiOctal = Integer.toOctalString(nilaidesimal);
            System.out.println(" angka biner " + biner +" di konversikan menjadi oktal adalah " + nilaiOctal);
            break;
        case "B" : System.out.println("menghitung biner menjadi desimal" +
                " maka masukan angka biner = ");
            biner = input.nextLine();
            System.out.println( " di konversasikan menjadi desimal adalah " + Integer.parseInt(biner,2));
            break;
        case "C" : System.out.println("menghitung biner menjadi heksa " +
                " maka masukan angka biner = ");
            int Nomerbiner = Integer.parseInt(input.nextLine(),2);
            String heksa = Integer.toHexString(Nomerbiner);
            System.out.println("di konversasikan menjadi heksa adalah " + heksa );
            break;
        case "D" : System.out.println("menghitung Oktal menjadi biner " +
                " maka masukan angka oktal = ");
            String nomerOktal = input.nextLine();

    }
}
}
