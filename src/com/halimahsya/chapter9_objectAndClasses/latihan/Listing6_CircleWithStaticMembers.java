package com.halimahsya.chapter9_objectAndClasses.latihan;

import com.halimahsya.chapter2.tugas.Circle;

public class Listing6_CircleWithStaticMembers {
    double radius;

    static int numberOfObjects = 0;

    Listing6_CircleWithStaticMembers(){
        radius = 1;
        numberOfObjects++;
    }
    Listing6_CircleWithStaticMembers(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }
     static int getNumberOfObjects(){
        return numberOfObjects;
     }
    double getArea(){
        return radius * radius * Math.PI;
    }
}
