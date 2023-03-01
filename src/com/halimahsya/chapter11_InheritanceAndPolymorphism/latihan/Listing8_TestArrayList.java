package com.halimahsya.chapter11_InheritanceAndPolymorphism.latihan;

import java.util.ArrayList;

public class Listing8_TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();

        cityList.add("london");
        cityList.add("denver");
        cityList.add("paris");
        cityList.add("miami");
        cityList.add("seoul");
        cityList.add("tokyo");

        System.out.println("  banyak list? " + cityList.size());
        System.out.println("apakah miami ada di list? " + cityList.contains("miami"));
        System.out.println(" apakah lokasi denver ada di list? " + cityList.indexOf("denver"));
        System.out.println(" apakah listnya kosong? " + cityList.isEmpty());

        cityList.add(2, "xian");
        cityList.remove("miami");
        cityList.remove(1);

        System.out.println(cityList.toString());
        for (int i = cityList.size() - 1; i >= 0; i--)
            System.out.println(cityList.get(i) + " ");
        System.out.println();
        ArrayList<Listing2_CircleFromSimpleGeometricObject> list = new ArrayList<>();

        list.add(new Listing2_CircleFromSimpleGeometricObject(2));
        list.add(new Listing2_CircleFromSimpleGeometricObject(3));

        System.out.println("area dari lingkaran?" + list.get(0).getArea());
    }
}
