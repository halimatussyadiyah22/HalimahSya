package com.halimahsya.chapter11_InheritanceAndPolymorphism.latihan;

import java.util.SimpleTimeZone;

public class Listing1_SimpleGeometricObject {
    private String color = "putih";
    private boolean filled;
    private java.util.Date dateCreated;

    public Listing1_SimpleGeometricObject(){
        dateCreated = new java.util.Date();
    }
    public Listing1_SimpleGeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void  setFilled(boolean filled){
        this.filled = filled;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    public String toString(){
        return " dibuat di " + dateCreated + "\nwarna: " + color + " dan diisi : " + filled;
    }
}
