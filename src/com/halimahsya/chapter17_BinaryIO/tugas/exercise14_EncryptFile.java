package com.halimahsya.chapter17_BinaryIO.tugas;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class exercise14_EncryptFile {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("enter input file name : ");
        String inFile = input.next();
        System.out.println("enter output file name : ");
        String outFile = input.next();

        try (
                RandomAccessFile source = new RandomAccessFile(inFile, "r");
                RandomAccessFile target = new RandomAccessFile(outFile,"rw");
                ){
            int r = 0;
            source.seek(0);
            while ((r = source.read()) != -1){
                target.write(((byte)r)+5);
            }

        }

    }
}
