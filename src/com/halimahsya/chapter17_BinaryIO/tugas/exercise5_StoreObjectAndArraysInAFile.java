package com.halimahsya.chapter17_BinaryIO.tugas;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class exercise5_StoreObjectAndArraysInAFile {
    public static void main(String[] args) throws IOException {
        int[] numbers = {1,2,3,4,5};

        try (
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_05.dat"));
                ){
            output.writeObject(numbers);
            output.writeDouble(5.5);
            output.writeObject(new java.util.Date());

        }

    }
}
