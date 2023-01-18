package com.halimahsya.chapter5.tugas;

import java.util.Scanner;

public class duanilaitertinggi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print(" masukan nomer siswa = ");
        int nomersiswa = input.nextInt();

        int score,
                tertinggi=0,
                tertinggi2=0;
        String nama = "",
                siswa1 ="",
                siswa2 = "";

        System.out.println(" masukan nama dan nilai siswa yang lain = ");
        for(int i = 0; i < nomersiswa; i++){
            System.out.print( " siswa= " + (i + 1) + "\n nama: ");
            nama = input.next();
            System.out.print(" nilai = ");
            score = input.nextInt();

            if(i == 0){

                tertinggi = score;
                siswa1  = nama;

            } else if (i == 1 && score > tertinggi) {
                tertinggi2 = tertinggi;
                tertinggi = score;
                siswa2 = siswa1;
                siswa1 = nama;

            }
            else if (i == 1){
                tertinggi2 = score;
                siswa2 = nama;

            } else if (i > 1 && score > tertinggi && score > tertinggi2) {
                tertinggi2 = tertinggi;
                siswa2 = siswa1;
                tertinggi = score;
                siswa1 = nama;

            } else if(i > 1 && score > tertinggi2) {
                siswa2 = nama;
                tertinggi2 = score;
            }
        }
        System.out.println( " penilaian tertinggi: " + siswa1 + "\nsiswa nilai tertinggi ke 2 : " + siswa2);

    }
}
