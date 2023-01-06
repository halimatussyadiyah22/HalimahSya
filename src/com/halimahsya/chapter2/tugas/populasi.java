package com.halimahsya.chapter2.tugas;

import java.util.Scanner;
public class populasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("masukan jumlah tahun: ");
        int tahun = input.nextInt();

        int populasi = 312032486 + (((31536000 / 7) - (3153600 / 13) + 
                    (31536000 / 45)) * tahun);
        
        System.out.println(" populasi di " + tahun + " adalah " + populasi);
    }
    
}
