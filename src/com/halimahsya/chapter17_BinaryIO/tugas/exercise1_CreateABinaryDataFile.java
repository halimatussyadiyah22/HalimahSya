package com.halimahsya.chapter17_BinaryIO.tugas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class exercise1_CreateABinaryDataFile {
    public static void main(String[] args)throws FileNotFoundException {

        ArrayList<String> list = new ArrayList<>();

        File file = new File("exercise17_01.txt");
        if (file.exists()){
            try (
                Scanner input = new Scanner(file);
            ){
                while (input.hasNext()){
                    list.add(input.nextLine());
                }

        }
    }
        for (int i = 0; i < 100; i++){
            list .add(((int)(Math.random() * 100)) + " ");
        }
        try (
                PrintWriter output = new PrintWriter(file);
                ){
            for (String l : list){
                output.print(l);
            }

        }
        }
}
