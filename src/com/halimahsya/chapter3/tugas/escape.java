package com.halimahsya.chapter3.tugas;
import java.util.Scanner;
public class escape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // backspace(mengilangkan space)
        System.out.println("to \bmy last");
        // membuat paragraf
        System.out.println("\tto my last");
        // garis baru / enter
        System.out.println("to \nmy last");
        // tanda kutip "" tapi samar
        System.out.println("to \fmy\f last");
        // menghilangkan kalimat/kata sebelumnya
        System.out.println("to \rmy last");
        // menambahkan tanda \
        System.out.println("to \\my last");
        // menambahkan "
        System.out.println("to \"my\" last");






    }
}
