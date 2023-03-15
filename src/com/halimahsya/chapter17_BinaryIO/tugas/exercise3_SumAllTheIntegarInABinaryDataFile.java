package com.halimahsya.chapter17_BinaryIO.tugas;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class exercise3_SumAllTheIntegarInABinaryDataFile {
    public static void main(String[] args) throws IOException {
        int sum = 0;

        try (
                DataInputStream input = new DataInputStream(new FileInputStream("exercise17_03.dat"));
                ){
            while (true)
                sum += input.readInt();

        }
        catch (EOFException ex){
            System.out.println("sum of the integers is : " + sum);
        }
    }
}
