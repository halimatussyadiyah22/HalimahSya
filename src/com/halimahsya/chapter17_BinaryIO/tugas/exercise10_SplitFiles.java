package com.halimahsya.chapter17_BinaryIO.tugas;

import java.io.IOException;
import java.io.RandomAccessFile;

public class exercise10_SplitFiles {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("usage : java exercise17_10 sourceFile numberOfPieces");
            System.exit(1);
        }
        int numberOfPieces = Integer.parseInt(args[1]);
        RandomAccessFile[] splits = new RandomAccessFile[numberOfPieces];

        try (RandomAccessFile inout = new RandomAccessFile(args[0], "r");
        ) {
            for (int i = 0; i < splits.length; i++) {
                splits[i] = new RandomAccessFile(args[0] + "." + (i + 1), "rw");
            }
            int siza = Math.round(inout.length() / numberOfPieces);
            int count = 0;
            byte[] b;

            for (int i = 0; i < numberOfPieces - 1; i++) {
                inout.seek(count * siza);
                b = new byte[siza];
                inout.read(b);
                splits[i].write(b);
                count++;
            }
            inout.seek(count * siza);
            b = new byte[(int) inout.length() - (count * siza)];
            inout.read(b);
            splits[numberOfPieces - 1].write(b);


        }

    }
}
