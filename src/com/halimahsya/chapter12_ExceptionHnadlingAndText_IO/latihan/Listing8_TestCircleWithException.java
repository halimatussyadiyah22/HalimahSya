package com.halimahsya.chapter12_ExceptionHnadlingAndText_IO.latihan;

public class Listing8_TestCircleWithException {
    public static void main(String[] args) {
        try {
            Listing7_CircleWithException c1 = new Listing7_CircleWithException(5);
            Listing7_CircleWithException c2 = new Listing7_CircleWithException(5);
            Listing7_CircleWithException c3 = new Listing7_CircleWithException(5);
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex);
        }
        System.out.println(" jumlah objek yang dibuat : " + Listing7_CircleWithException.getNumberOfObject());
    }
}
