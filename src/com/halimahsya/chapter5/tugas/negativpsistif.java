package com.halimahsya.chapter5.tugas;

import java.util.Scanner;

public class negativpsistif {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            int positif=0,negatif=0,menghitung=0,nomer;
            double total=0,average;

        System.out.println(" masukan sebuah bilangan bulat, input akan selesai ketika angka 0 muncul = ");
        nomer = input.nextInt();
        if (nomer == 0){
            System.out.println(" semua nomer boleh di masukan kecuali 0 ");
            System.exit(1);

        }
        while (nomer != 0) {
            if (nomer > 0)
                positif++;
            else
                negatif++;
            total += nomer;
            menghitung++;
            nomer = input.nextInt();
        }

        average = total / menghitung;

        System.out.println(" nomer yang positif adalah " + positif +
                "\nnomer yang negatif adalah " + negatif + " \ntotal nya adalah " + total +
                " \ndan nilai rata rata adalah " + average );


    }
}
