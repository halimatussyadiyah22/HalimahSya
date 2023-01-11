package com.halimahsya.chapter5.tugas;

public class Excercise20_bilanganprima2_1000 {
    public static void main(String[] args){
        final int BilanganPrimaPerBaris = 8;
        int hitung =0,nomer,divisor;

        System.out.println(" nomer prima antara 2 -1000, inklusif adalah \n");
        for (nomer = 2; nomer <= 1000; nomer++){
            boolean prima = true;
            for ( divisor = 2; divisor <= nomer / 2; divisor++){
                if(nomer % divisor == 0){
                    prima = false;
                break;
            }
        }
        if (prima ){
            hitung++;
            if( hitung % BilanganPrimaPerBaris == 0) {
                System.out.println(nomer);
            }
            else
                System.out.print(nomer + " ");
        }
        }

    }
}
