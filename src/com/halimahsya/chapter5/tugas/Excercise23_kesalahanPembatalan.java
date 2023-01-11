package com.halimahsya.chapter5.tugas;

public class Excercise23_kesalahanPembatalan {
    public static void main(String[] args){
        double jumlahKananKiri =0.0,i,jumlahKiriKanan;
        for (i = 1.0; i <= 50000.0; i++){
            jumlahKananKiri += 1/i;
        }
        System.out.println(" penjumlahan seri dari kanan ke kiri : " + jumlahKananKiri);
        jumlahKiriKanan =0.0;
        for (i = 50000.0; i >= 1.0; i--){
            jumlahKiriKanan += 1/i;
        }
        System.out.println(" penjumlahan seri dari kiri ke kanan : " + jumlahKiriKanan );

        System.out.println(" penjumlahan dari seri kanan ke kiri - " + " penjumlahan seri dari kiri ke kanan: " + ( jumlahKananKiri - jumlahKiriKanan ));
    }
}
