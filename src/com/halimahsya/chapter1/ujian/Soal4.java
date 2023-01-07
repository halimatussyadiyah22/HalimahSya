package com.halimahsya.chapter1.ujian;

public class Soal4 {
    public static void main(String[] args) {

      double M = 50.0;
      double H = 2.0;
      double m = 30.0;
      double S = 45.0;

      double KecepatanRatarata = M / ( H + ( m / 60 ) + ( S / 3600 ) )* 1.60;
      System.out.println( M / ( H + ( m / 60 ) + ( S / 3600) )* 1.60);
      System.out.println(" 50 / ( 20 + (30 / 60) + ( 45 / 3600) )* 1.60 ");
      System.out.println("Kecepatan Rata-rata dalam Kilometer per jam adalah");
      System.out.printf("%.2f", KecepatanRatarata);
      System.out.printf("km / Jam");
    
    }
}