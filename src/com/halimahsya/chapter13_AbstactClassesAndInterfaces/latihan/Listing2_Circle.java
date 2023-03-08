package com.halimahsya.chapter13_AbstactClassesAndInterfaces.latihan;

public class Listing2_Circle extends Listing1_GeometricObject{
    private double radius;

    public Listing2_Circle() {
    }

    public Listing2_Circle(double radius) {
        this.radius = radius;
    }

    public Listing2_Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void printCircle() {
        System.out.println(" lingkarannya dibuat " + getDateCreated() + "dan radiusnya adalah " + radius);
    }
}
