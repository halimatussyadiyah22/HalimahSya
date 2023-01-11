package com.halimahsya.chapter5.tugas;

import java.util.Scanner;

public class Excercise28_hariPertamaDisetiapBulan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print(" masukan tahun : ( e.g., 2012) : ");
        int tahun = input.nextInt();
        System.out.print(" masukan hari pertama dari tahun = ");
        int hari = input.nextInt();

        String output;
        for (int bulan = 1; bulan <= 12; bulan++){
            output = "";
            switch (bulan ){
                case 1 : output += "januari"; break;
                case 2 : output += "februari"; break;
                case 3 : output += "maret"; break;
                case 4 : output += "april"; break;
                case 5 : output += "mei"; break;
                case 6 : output += "juni"; break;
                case 7 : output += "juli"; break;
                case 8 : output += "agustus"; break;
                case 9 : output += "september"; break;
                case 10 : output += "oktober"; break;
                case 11 : output += "november"; break;
                case 12 : output += "desember"; break;
                }
                output += "1, " + tahun + " adalah ";
            hari %= 7;
            switch (hari){
                case 0 : System.out.println(output + " ahad ");break;
                case 1 : System.out.println(output + " senin ");break;
                case 2 : System.out.println(output + " selasa ");break;
                case 3 : System.out.println(output + " rabu ");break;
                case 4 : System.out.println(output + " kamis ");break;
                case 5 : System.out.println(output + " jumat ");break;
                case 6 : System.out.println(output + " sabtu ");break;
            }
            if (bulan == 1 || bulan == 3 || bulan == 5 || bulan == 7 ||
        bulan == 8 || bulan == 10 || bulan == 12) {
                hari += 31;
            }else if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) {
                hari += 30;
            }else {
                    if (((tahun % 4 == 0) && (tahun % 100 != 0)) || (tahun % 400 == 0)) {
                        hari += 29;
                    }else
                        hari += 28;

            }
        }

    }
}
