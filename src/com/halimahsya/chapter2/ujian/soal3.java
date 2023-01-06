package com.halimahsya.chapter2.ujian;

import java.util.Scanner;
    public class soal3{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("masukan no antara 1000 sampai 9999:  ");
            int nomer = input.nextInt();

            int kurangDari1010 = nomer % 10;
            nomer /= 10;
            int puluhan = nomer % 10;
            nomer /= 10;
            int ratusan = nomer % 10;
            nomer/= 10;
            int ribuan = nomer % 10;
            nomer/= 10;
            int sum = ribuan + ratusan + puluhan + kurangDari1010;

            System.out.println("sum jumlah adalah " + sum);
        }
    }