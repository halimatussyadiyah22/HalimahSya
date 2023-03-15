package com.halimahsya.chapter17_BinaryIO.tugas;

import java.io.IOException;
import java.io.RandomAccessFile;

public class exercise8_UpdateCount {
    public static void main(String[] args) throws IOException {
        try (
                RandomAccessFile inout = new RandomAccessFile("exercise17_08.dat","rw");
                ){
            if (inout.length() == 0){
                inout.writeInt(1);
            }
            else {
                int count = inout.readInt();
                inout.seek(0);
                inout.writeInt(++count);
            }
        }

    }
}
