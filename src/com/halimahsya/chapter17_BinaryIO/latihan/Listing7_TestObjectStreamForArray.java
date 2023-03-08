package com.halimahsya.chapter17_BinaryIO.latihan;

import java.io.*;

public class Listing7_TestObjectStreamForArray {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        int[] numbers = {1,2,3,4,5};
        String[] strings = {"john "," susan "," kim "};

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(" array.dat",true));
        ){
            output.writeObject(numbers);
            output.writeObject(strings);
        }
        try (ObjectInputStream input =
                        new ObjectInputStream(new FileInputStream("array.dat"));
                ){
            int [] newNumbers = (int[]) (input.readObject());
            String[] newStrings = (String[]) (input.readObject());

            for (int i = 0; i < newNumbers.length; i++)
                System.out.println(newNumbers[i] + " ");
            System.out.println();

            for (int i = 0; i < newStrings.length; i++)
                System.out.print(newStrings[i] + " ");

        }
    }
}
