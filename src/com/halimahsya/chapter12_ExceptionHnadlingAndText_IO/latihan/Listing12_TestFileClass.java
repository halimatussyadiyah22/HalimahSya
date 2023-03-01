package com.halimahsya.chapter12_ExceptionHnadlingAndText_IO.latihan;

public class Listing12_TestFileClass {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("image/us.gif");
        System.out.println("does it exist? " + file.exists());
        System.out.println(" the file has " + file.length() + " bytes");
        System.out.println(" can it be read? " + file.canRead());
        System.out.println(" can it be written? " + file.canWrite());
        System.out.println(" is it a directory ? " + file.isDirectory());
        System.out.println(" is it a file? " + file.isFile());
        System.out.println(" is it absolute? " + file.isAbsolute());
        System.out.println(" is it hidden? " + file.isHidden());
        System.out.println(" absolute path is " + file.getAbsolutePath());
        System.out.println(" Last modified on " + new java.util.Date(file.lastModified()));

    }
}
