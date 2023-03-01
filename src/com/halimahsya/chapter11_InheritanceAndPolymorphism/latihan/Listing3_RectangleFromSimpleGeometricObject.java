package com.halimahsya.chapter11_InheritanceAndPolymorphism.latihan;

public class Listing3_RectangleFromSimpleGeometricObject
    extends Listing1_SimpleGeometricObject{
        private double width;
        private double height;

        public Listing3_RectangleFromSimpleGeometricObject(){
        }
        public Listing3_RectangleFromSimpleGeometricObject(double width, double height){
            this.width = width;
            this.height = height;
    }
    public Listing3_RectangleFromSimpleGeometricObject(
            double width,double height,String color, boolean filled){
            this.width = width;
            this.height = height;
            setColor(color);
            setFilled(filled);
    }
    public double getWidth(){
            return width;
    }
    public void setWidth(double width){
            this.width = width;
    }
    public double getHeight(){
            return height;
    }
    public void setHeight(double height){
            this.height = height;
    }
    public double getArea(){
            return width * height;
    }
    public double getPerimeter(){
            return 2 * (width * height);
    }
}
