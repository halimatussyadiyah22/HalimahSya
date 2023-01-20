package com.halimahsya.chapter6_methods.latihan;

import java.util.Scanner;

public class Listing12_printChalender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" masukan tahun ( e.g., 2012): ");
        int tahun = input.nextInt();
        System.out.println(" masukan bulan dengan nomer 1 -12 : ");
        int bulan = input.nextInt();

        printBulan(tahun, bulan);

    }
    public static void printBulan(int tahun,int bulan ){
        printJudulBulan(tahun, bulan);
        printbodyBulan(tahun,bulan);
    }
    public static void printJudulBulan(int tahun , int bulan){
        System.out.println("        " + NamaBulan(bulan) + "" + tahun );
        System.out.println("-------------------------------------------");
        System.out.println(" min sen sel rab kam jum sab ");
    }
    public static String NamaBulan(int bulan){
        String namabulan = "";
        switch (bulan){
            case 1 : namabulan = " januari ";break;
            case 2: namabulan = " februari ";break;
            case 3 : namabulan = " maret ";break;
            case 4 : namabulan = " april ";break;
            case 5 : namabulan = " mei ";break;
            case 6 : namabulan = " juni ";break;
            case 7 : namabulan = " juli ";break;
            case 8 : namabulan = " agustus ";break;
            case 9 : namabulan = " september ";break;
            case 10 : namabulan = " oktober ";break;
            case 11 : namabulan = " november ";break;
            case 12 : namabulan = " desember ";break;

        }
        return namabulan;
    }
    public static void printbodyBulan(int tahun,int bulan){
        int haridimulai = hariMulai(tahun,bulan);
                int jumlahHariPerbulan = getNumberOfNumberDaysInMonth(tahun,bulan);
        int i =0;
        for (i = 0; i < haridimulai; i++)
            System.out.print("    ");
        for (i=1; i <= jumlahHariPerbulan; i++) {
            System.out.printf("%4d", i);
            if ((i + haridimulai) % 7 == 0)
                System.out.println();
        }
        System.out.println();

    }
    public static int hariMulai(int tahun,int bulan){
        final int Hari_Mulai_untuk_1_jan_1800 = 3;
        int jumlahhariperbulan = totalhariperbulan(tahun,bulan);
        return (jumlahhariperbulan + Hari_Mulai_untuk_1_jan_1800)%7;
    }
    public  static int totalhariperbulan(int tahun, int bulan){
        int total = 0;
        for (int i = 1800; i < tahun; i++)
            if (isLeapyear(i)) {
                total = total + 366;
            }else
                    total = total + 365;

                    for (int i= 1; i < bulan; i++)
                        total = total + getNumberOfNumberDaysInMonth(tahun,i);
                    return total;
    }
    public static int getNumberOfNumberDaysInMonth(int tahun, int bulan){

        if (bulan == 1 || bulan == 3 || bulan == 5 || bulan == 7 || bulan == 8 || bulan == 10 || bulan == 12)
            return  31;
        if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11)
            return  30;
        if (bulan == 2)
            return  isLeapyear(tahun)? 29 : 28;
        return 0;
    }
    public static boolean isLeapyear(int tahun){
        return  tahun %400 == 0 || (tahun %4==0 && tahun %100 != 0 );
    }
}
