package com.halimahsya.chapter9_objectAndClasses.tugas;

public class excercise1_Rectangle1 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,40);

        Rectangle rectangle2 = new Rectangle(3.5,35.9);

        System.out.println("\nRectangle 1 ");
        System.out.println("-------------------");
        System.out.println("lebar:      " + rectangle1.width);
        System.out.println("tinggi:     " + rectangle1.height);
        System.out.println("luas:       " + rectangle1.getArea());
        System.out.println("perimeter:  " + rectangle1.getPerimeter());

        System.out.println("\nRectangle 2 ");
        System.out.println("-------------------");
        System.out.println("lebar:      " + rectangle2.width);
        System.out.println("tinggi:     " + rectangle2.height);
        System.out.println("luas:       " + rectangle2.getArea());
        System.out.println("perimeter:  " + rectangle2.getPerimeter());
    }
}
