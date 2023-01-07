package com.halimahsya.chapter5.tugas;

public class divisiblenumber {
    public static void main(String[] args){
        final int  nomerperbaris =10;
        int hitung = 0;

        for (int i = 100; i <= 1000; i++){
            if(i% 5 == 0 && i % 6 == 0){
                if(i % 5 == 0 && i % 6 == 0){
                    hitung++;
                    if(hitung % nomerperbaris == 0)
                        System.out.println(i);
                    else
                        System.out.print(i + " ");
                }
            }
        }

    }
}
