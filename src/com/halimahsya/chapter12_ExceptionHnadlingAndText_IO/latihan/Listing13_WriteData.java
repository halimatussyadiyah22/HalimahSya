package com.halimahsya.chapter12_ExceptionHnadlingAndText_IO.latihan;

public class Listing13_WriteData {
    public static void main(String[] args) throws java.io.IOException{
        java.io.File file = new java.io.File("scores.txt");
        if (file.exists()){
            System.out.println("file sudah ada ");
            System.exit(1);
        }
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        output.println("john T Smith ");
        output.println(90);
        output.print("eric k jones ");
        output.println(85);

        output.close();
    }
}
