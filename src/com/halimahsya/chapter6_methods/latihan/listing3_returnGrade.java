package com.halimahsya.chapter6_methods.latihan;

public class listing3_returnGrade {
    public static void main(String[] args){
        System.out.println(" nilainya adalah " + nilainya(78.5));
        System.out.println(" nilainya adalah " + nilainya(59.5));

    }
    public static char nilainya(double skor){
        if (skor >= 90.0)
            return 'A';
        else if (skor >= 80.0)
            return 'B';
            else if ( skor >= 70.0)
                return 'C';
            else if ( skor >= 60.0)
                return 'D';
                else
                    return 'F';
    }


}
