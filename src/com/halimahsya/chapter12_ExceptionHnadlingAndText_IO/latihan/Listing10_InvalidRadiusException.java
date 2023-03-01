package com.halimahsya.chapter12_ExceptionHnadlingAndText_IO.latihan;

public class Listing10_InvalidRadiusException extends Exception{
    private double radius;

    public Listing10_InvalidRadiusException(double radius){
        super(" radius yang tidak valid " + radius);
        this.radius = radius;
    }
    public  double getRadius(){
        return radius;
    }
}
