package com.halimahsya.chapter11_InheritanceAndPolymorphism.latihan;

public class Listing4_TestCircleRectangle {
    public static void main(String[] args) {
        Listing2_CircleFromSimpleGeometricObject circle = new Listing2_CircleFromSimpleGeometricObject(1);
        System.out.println(" lingkaran " + circle.toString());
        System.out.println(" warnanya adalah " + circle.getColor());
        System.out.println(" radiusnya adalah " + circle.getRadius());
        System.out.println(" areanya adalah " + circle.getArea());
        System.out.println("diameternya adalah " + circle.getDiameter());

        Listing3_RectangleFromSimpleGeometricObject rectangle =
                new Listing3_RectangleFromSimpleGeometricObject(2,4);
        System.out.println("\nPersegi panjang " + rectangle.toString());
        System.out.println(" areanya adalah " + rectangle.getArea());
        System.out.println(" perimeternya adalah " + rectangle.getPerimeter());
    }
}
