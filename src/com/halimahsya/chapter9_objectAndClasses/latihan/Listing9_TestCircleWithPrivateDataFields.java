package com.halimahsya.chapter9_objectAndClasses.latihan;

import com.halimahsya.chapter2.tugas.Circle;

public class Listing9_TestCircleWithPrivateDataFields {
    public static void main(String[] args) {
        Listing8_CircleWithPrivateDataFields myCircle = new Listing8_CircleWithPrivateDataFields(5.0);
        System.out.println(" radius area lingkaran " + myCircle.getRadius() + " adalah " + myCircle.getArea());
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println(" radius area lingkaran " + myCircle.getRadius() + " adalah " + myCircle.getArea());

        System.out.println(" jumlah dari objek yang dibuat adalah " + Listing8_CircleWithPrivateDataFields.getNumberOfObjects());
    }
}
