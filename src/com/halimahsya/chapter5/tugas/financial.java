package com.halimahsya.chapter5.tugas;

public class financial {
    public static void main(String[] args){
        double total=0,tuition = 10000;
        int tahun = 0;
                while(tahun<14){
                    tuition += 0.05 * tuition;
                    if(tahun == 10) System.out.printf(" tuisi dalam 10 tahun : $%1.2f", tuition);
                    if(tahun >= 10){
                        total += tuition;
                    }
                    if(tahun == 13)System.out.printf(" biaya dalam 10 tahun 4 tahun tuisi akan $%1.2f",total);
                    tahun++;
                }
    }
}
