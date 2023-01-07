package com.halimahsya.chapter5.tugas;

import java.util.Scanner;

public class highscore {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int nilaitertinggi = 0;
        String namaNilaitertinggi = "";

        System.out.print( " masukan nomer siswa : ");
        int nomersiswa = input.nextInt();

        System.out.println(" masukan nama siswa lain dan nilainya : ");
        for(int i = 0; i< nomersiswa; i++){
            System.out.print(" siswa : " + (i + 1) + "\n  nama : ");

            String nama = input.nextLine();

            System.out.print(" nilai : " );
            int score = input.nextInt();


            if ( score > nilaitertinggi){
                nilaitertinggi= score;
                namaNilaitertinggi = nama;
            }
        }
        System.out.println("siswa dengan nilai tertinggi : " + nilaitertinggi);

    }
}
