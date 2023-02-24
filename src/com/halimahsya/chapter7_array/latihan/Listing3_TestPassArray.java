package com.halimahsya.chapter7_array.latihan;

public class Listing3_TestPassArray {
    public static void main(String[] args) {
        int[] a = {1,2};

        System.out.println("Sebelum menjalankan swap");
        System.out.println("array adalah {" + a[0] + ", " + a[1] + "}");
        System.out.println("Sesudah menjalankan swap");
        System.out.println("array adalah {" + a[0] + ", " + a[1] + "}");

        System.out.println("Sebelum menjalankan swapPertamaDuaDiArray");
        System.out.println("array adalah {" + a[0] + ", " + a[1] + "}");
        System.out.println("Sesudah menjalankan swapPertamaDuaDiArray");
        System.out.println("array adalah {" + a[0] + ", " + a[1] + "}");

    }
    public static void swap(int n1,int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }
    public static void  swapFirstTwoArray(int[] array){
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
