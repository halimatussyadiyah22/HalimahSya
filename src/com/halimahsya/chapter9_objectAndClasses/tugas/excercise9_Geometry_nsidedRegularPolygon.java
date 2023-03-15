package com.halimahsya.chapter9_objectAndClasses.tugas;

public class excercise9_Geometry_nsidedRegularPolygon {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6,4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10,4,5.6,7.8);

        System.out.println("\n--------------------------------------------------------");
        System.out.println("| Regular Polygon Objects | perimeter | Area |");
        System.out.println("--------------------------------------------------------");
        System.out.printf("|        object# 1       |%8.2f      |%6.2f  |\n",
                regularPolygon1.getParimeter(),regularPolygon1.getArea());
        System.out.printf("|        object# 2       |%8.2f      |%6.2f  |\n",
                regularPolygon1.getParimeter(),regularPolygon1.getArea());
        System.out.printf("|        object# 3       |%8.2f      |%6.2f  |\n",
                regularPolygon1.getParimeter(),regularPolygon1.getArea());
        System.out.println("--------------------------------------------------------");


    }
}
