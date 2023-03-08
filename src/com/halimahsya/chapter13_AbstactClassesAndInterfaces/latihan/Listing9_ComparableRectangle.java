package com.halimahsya.chapter13_AbstactClassesAndInterfaces.latihan;

public class Listing9_ComparableRectangle extends Listing3_Rectangle
implements Comparable<Listing9_ComparableRectangle>{
    public Listing9_ComparableRectangle(double width,double height){
        super(width,height);
    }
    @Override
    public int compareTo(Listing9_ComparableRectangle o){
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }
    @Override
    public String toString(){
        return super.toString() + "area: " + getArea();
    }
}
