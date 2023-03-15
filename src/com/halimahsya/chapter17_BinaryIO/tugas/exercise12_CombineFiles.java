package com.halimahsya.chapter17_BinaryIO.tugas;

import java.io.IOException;
import java.io.RandomAccessFile;

public class exercise12_CombineFiles {
    public static void main(String[] args) throws IOException {
        if (args.length < 2){
            System.out.println(
                    "usage : java exercise17_12 SourceFile1 . . . SourceFilen TargetFile ");
            System.exit(0);
        }
        RandomAccessFile[]  source = new RandomAccessFile[args.length - 1];
        try (
            RandomAccessFile target = new RandomAccessFile(args[args.length - 1], "rw");
        ){
            for (int i = 0; i < source.length; i++){
                byte[] b = new byte[(int)source[i].length()];
                source[i].seek(0);
                source[i].read(b);
                target.seek(target.length());
                target.write(b);
            }
        }

    }
}
