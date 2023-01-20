package com.halimahsya.chapter6_methods.latihan;

public class Listing9_TestMethodOverLoading {
    public static void main(String[] args){
        System.out.println(" yang paling tinggi di antara 3 dan 4 adlah " + max(3,4));
        System.out.println(" yang paling tinggi di antara 3.0 dan 5.4 adalah " + max(3.0,5.4));
        System.out.println( " yang paling tinggi di antara 3.0, 5.4, dan 10.14 adalah " + max(3.0,5.4,10.14));

    }
     public  static int max ( int nomer1, int nomer2){
        if(nomer1 > nomer2)
            return  nomer1;
        else
            return nomer2;
     }
     public static double max( double nomer1, double nomer2){
        if (nomer1 > nomer2)
            return nomer1;
        else
            return nomer2;
     }
     public static double max( double nomer1,double nomer2,
                               double nomer3){
        return  max(max(nomer1,nomer2),nomer3);
     }
}
