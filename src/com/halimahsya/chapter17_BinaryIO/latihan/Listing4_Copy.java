package com.halimahsya.chapter17_BinaryIO.latihan;

import java.io.*;

public class Listing4_Copy {
    public static void main(String[] args) throws IOException {
        if (args.length != 2){
            System.out.println(" usage : java copy  sourceFile targetfile");
            System.exit(1);
        }
        File sourceFile = new File(args[0] );
        if (!sourceFile.exists()){
            System.out.println("source file " + args[0] +
                    "does not exist ");
            System.exit(2);
        }
        File targetFile = new File(args[1]);
        if (targetFile.exists()){
            System.out.println("target file " + args[1]
             + " already exists");
            System.exit(3);
        }
        try (BufferedInputStream input =
                     new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream output =
                     new BufferedOutputStream(new FileOutputStream(targetFile));
        ){
            int r, numberOfBytesCopied = 0;
            while ((r = input.read()) !=  -1){
                output.write((byte)r);
                numberOfBytesCopied++;
            }
            System.out.println(numberOfBytesCopied + " bytes copied ");

        }

    }
}
