package com.halimahsya.chapter12_ExceptionHnadlingAndText_IO.latihan;

public class Listing7_CircleWithException {
    private double radius;
    private static int numberOfObject = 0;

   public Listing7_CircleWithException(){
       this(1.0);
   }
   public Listing7_CircleWithException(double newRadius){
       setRadius(newRadius);
       numberOfObject++;
   }
   public  double getRadius(){
       return radius;
   }
   public void setRadius(double newRadius)
       throws IllegalArgumentException {
       if (newRadius >= 0 )
           radius = newRadius;
       else
           throw new IllegalArgumentException(" radius tidak bisa menjadi negatif ");
   }
   public static int getNumberOfObject(){
       return numberOfObject;
   }
   public double findArea(){
       return radius * radius * 3.14159;
   }
}
