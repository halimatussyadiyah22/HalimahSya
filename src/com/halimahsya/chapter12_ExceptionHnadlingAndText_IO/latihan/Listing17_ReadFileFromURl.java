package com.halimahsya.chapter12_ExceptionHnadlingAndText_IO.latihan;

import java.util.Scanner;

public class Listing17_ReadFileFromURl {
    public static void main(String[] args) {
        System.out.println(" masukan URL : ");
        String URLString = new Scanner(System.in).next();
        try {
            java.net.URL url = new java.net.URL(URLString);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()){
                String line = input.nextLine();
                count += line.length();
            }
            System.out.println(" ukuran file adalah " + count + " karakter");
        }
        catch (java.net.MalformedURLException ex){
            System.out.println(" URL tidak valid");
        }
        catch (java.io.IOException ex){
            System.out.println("I/O errors : no such file");
        }
    }
}
