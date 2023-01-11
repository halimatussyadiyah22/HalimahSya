package com.halimahsya.chapter5.tugas;

public class Excercise24_Jumlahperseri {
    public static void main(String[] args){
        double sum = 0.0,n;
        for( n = 1.0; n <= 97.0; n += 2){
            sum += n/ (n + 2);
        }
        System.out.println(" seri : 1 / 3 + 3 / 5 + 5 / 7 + 7 / 9 + 9 / 11 + 11/ 13 + " + " ... + 95 / 97 + 97 / 99 ");
        System.out.println(" jumlah dari seri : " + sum);

    }
}
