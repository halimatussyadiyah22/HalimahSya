package com.halimahsya.chapter9_objectAndClasses.latihan;

public class Listing10_TestPassObject {
    public static void main(String[] args) {
        Listing8_CircleWithPrivateDataFields myCircle=
                new Listing8_CircleWithPrivateDataFields(1);
        int n = 5;
        printAreas(myCircle, n);

        System.out.println("\n" + "Radius adalah " + myCircle.getRadius());
        System.out.println("n adalah " + n);
    }
    public static void  printAreas(
            Listing8_CircleWithPrivateDataFields c, int times){
        System.out.println(" Radius \t\tArea");
        while (times >= 1){
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }

}
