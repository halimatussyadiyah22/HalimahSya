package com.halimahsya.chapter12_ExceptionHnadlingAndText_IO.latihan;

public class Listing14_WriteDataWithAutoClose {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("scores.txt");
        if (file.exists()){
            System.out.println("file sudah ada ");
            System.exit(0);
        }
        try (
            java.io.PrintWriter output = new java.io.PrintWriter(file);
        ){
            output.print("john T smith ");
            output.println(90);
            output.print("Eric k jones ");
            output.println(80);
        }
    }
}
