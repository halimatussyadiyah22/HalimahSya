package com.halimahsya.chapter11_InheritanceAndPolymorphism.latihan;

public class Listing5_PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new Listing2_CircleFromSimpleGeometricObject(1, "merah", false));
        displayObject(new Listing3_RectangleFromSimpleGeometricObject(1, 1, "hitam", true));

    }
    public static void displayObject(Listing1_SimpleGeometricObject object) {
        System.out.println(" dibuat di " + object.getDateCreated() + ". warna nya adalah " + object.getColor());
    }
}
