package com.halimahsya.chapter12_ExceptionHnadlingAndText_IO.latihan;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Listing16_ReplaceText {
    public static void main(String[] args) throws Exception{
        if (args.length != 4) {
            System.out.println(
                    "pengguna = java ReplaceText sourceFile targetFile oldStr NewStr ");
            System.exit(1);

        }
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println(" file berasal " + args[0] + " sudah ada ");
            System.exit(2);
        }
        File targetFile = new File(args[1]);
        if (targetFile.exists()){
            System.out.println("target file " + args[1] + "sudah ada");
            System.exit(3);
        }
        try (
            Scanner input = new Scanner(sourceFile);
            PrintWriter output  = new PrintWriter(targetFile);
        ){
            while (input.hasNext()){
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[2],args[3]);
                output.println(s2);
            }
        }
    }
}
