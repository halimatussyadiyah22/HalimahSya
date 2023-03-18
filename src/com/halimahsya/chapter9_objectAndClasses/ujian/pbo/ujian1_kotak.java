package com.halimahsya.chapter9_objectAndClasses.ujian.pbo;

public class ujian1_kotak {
    public static void main(String[] args) {
        Kotak kotak = new Kotak( );
        System.out.println("kotak 1 itu berisi " + kotak.getIsi() + " dengan warna " + kotak.getWarna());
        kotak.stok();



    }
}
class Kotak{

    Kotak(){
    }
    String getIsi(){
         return "kacang";

    }
    String getWarna(){
        return "hijau";
    }
     void stok(){
         System.out.println("beratnya itu 10 kg");
     }
}
