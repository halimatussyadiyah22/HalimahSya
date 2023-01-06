package com.halimahsya.chapter5.tugas;

public class kilogramtopound {
    public static void main(String[] args){
        final double poundkperkg = 2.2;
        System.out.println("kilogram     pounds      |      pounds          kilogram ");
        for( int k = 1, p= 20; k <= 199 && p <= 515; k += 2, p += 5) {
            System.out.printf(" %-12d%7.1f" , k, (k * poundkperkg));

            System.out.print( "     |       ");
            System.out.printf( "%-9d%12.2f\n", p, (p / poundkperkg));
        }
    }
}
