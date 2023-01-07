package com.halimahsya.chapter3.tugas;
import java.util.Scanner;
public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" masukan kota pertama = ");
        String kota1 = input.nextLine();
        System.out.println(" masukan kota kedua = ");
        String kota2 = input.nextLine();

        if (kota1.compareTo(kota2) < 0)
            System.out.println(" kota kota dalam urutan abjad adalah  " + kota1
                    + " " + kota2 );
        else
            System.out.println(" kota kota dalam urutan abjad adalah " + kota2
                    + " " + kota1 );

    }
}
