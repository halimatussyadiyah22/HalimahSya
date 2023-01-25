package com.halimahsya.chapter6_methods.tugas;

import java.util.Scanner;

public class exercise6_DisplayPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" masukan jumlah dari baris : ");
        int nomerDariBaris = input.nextInt();

        tampilkanPola(nomerDariBaris);

    }
    public static void tampilkanPola(int n ){
        int lapisan = n - 1;
        for (int r = 1; r <= n; r++){
            for (int p = 0; p < lapisan; p++){
                System.out.print("  ");
            }
            for (int i = r; i > 0; i--){
                System.out.print(i + " ");
            }
            System.out.println();
            lapisan--;
        }
    }
}
