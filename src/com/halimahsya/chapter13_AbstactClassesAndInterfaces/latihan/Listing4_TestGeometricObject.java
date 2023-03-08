package com.halimahsya.chapter13_AbstactClassesAndInterfaces.latihan;

import com.halimahsya.chapter2.tugas.Circle;

public class Listing4_TestGeometricObject {
    public static void main(String[] args) {
        Listing1_GeometricObject geoObject1 = new Listing2_Circle(5);
        Listing1_GeometricObject geoObject2 = new Listing3_Rectangle(5,3);
        System.out.println("ke 2 objek tersebut mempunyai luas yang sama ? " + equalArea(geoObject1,geoObject2));

        displayGeometricObject(geoObject1);
        displayGeometricObject(geoObject2);
    }
    public static boolean equalArea(Listing1_GeometricObject object1, Listing1_GeometricObject object2){
        return object1.getArea() == object2.getArea();
    }
    public static void displayGeometricObject(Listing1_GeometricObject object){
        System.out.println();
        System.out.println("luasnya adalah " + object.getArea());
        System.out.println(" perimeternya adalah " + object.getPerimeter());
    }
}
