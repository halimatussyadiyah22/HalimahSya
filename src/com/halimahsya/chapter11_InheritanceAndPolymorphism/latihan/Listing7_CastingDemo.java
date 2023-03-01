package com.halimahsya.chapter11_InheritanceAndPolymorphism.latihan;

public class Listing7_CastingDemo {
    public static void main(String[] args) {
        Object object1 = new Listing2_CircleFromSimpleGeometricObject(1);
        Object object2 = new Listing3_RectangleFromSimpleGeometricObject(1,1);

        displayObject(object1);
        displayObject(object2);
    }
    public static void displayObject(Object object){
        if (object instanceof Listing2_CircleFromSimpleGeometricObject){
            System.out.println(" area dari lingkaran adalah " + ((Listing2_CircleFromSimpleGeometricObject)object).getArea());
            System.out.println(" area dari lingkaran adalah " + ((Listing2_CircleFromSimpleGeometricObject)object).getDiameter());
        }
        else if (object instanceof Listing3_RectangleFromSimpleGeometricObject){
            System.out.println("area persegi panjang adlah " +
                    ((Listing3_RectangleFromSimpleGeometricObject)object).getArea());
        }
    }
}
