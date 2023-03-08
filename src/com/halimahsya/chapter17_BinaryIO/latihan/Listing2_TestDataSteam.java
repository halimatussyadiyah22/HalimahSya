package com.halimahsya.chapter17_BinaryIO.latihan;

import javax.xml.crypto.Data;
import java.io.*;

public class Listing2_TestDataSteam {
    public static void main(String[] args) throws IOException {
        try (
                DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
                ){
            output.writeUTF(" john ");
            output.writeDouble(85.5);
            output.writeUTF(" susan ");
            output.writeDouble(185.5);
            output.writeUTF(" kim ");
            output.writeDouble(105.25);
        }
        try (
                DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
                ){
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
        }
    }
}
