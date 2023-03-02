package com.halimahsya.chapter12_ExceptionHnadlingAndText_IO.latihan;

import com.halimahsya.chapter2.tugas.Circle;

public class Listing11_TestCircleWithCustomException {
    public static void main(String[] args) {
        try {
            new  CircleWithCustomException(5);
            new  CircleWithCustomException(-5);
            new CircleWithCustomException(0);

        }
        catch (Listing10_InvalidRadiusException ex){
            System.out.println(ex);
        }
        System.out.println(" jumlah dari objek yang dibuat : " +
                 CircleWithCustomException.getNumberOfObjek());
    }
}
class CircleWithCustomException{
    private double radius;
    private static int numberOfObjek = 0;

    public  CircleWithCustomException() throws Listing10_InvalidRadiusException{
        this(1.0);
    }
    public CircleWithCustomException(double newRadius )
        throws Listing10_InvalidRadiusException{
        setRadius(newRadius);
        numberOfObjek++;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius)
        throws Listing10_InvalidRadiusException{
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new Listing10_InvalidRadiusException(newRadius);
    }
    public static int getNumberOfObjek(){
        return numberOfObjek;
    }
    public double findArea(){
        return radius*radius* 3.14159;
    }
}
