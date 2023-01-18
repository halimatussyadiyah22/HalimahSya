package com.halimahsya.chapter3.tugas;
import java.util.Scanner;
public class substring {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String data1 = "UMPI Cianjur ";
        String data2 = "Cianjur jago ";

        String sub_data1 = data1.substring(0, 1);
        String sub_data2 = data2.substring(0, 7);

        System.out.println(sub_data1);
        System.out.println(sub_data2);
    }
}
