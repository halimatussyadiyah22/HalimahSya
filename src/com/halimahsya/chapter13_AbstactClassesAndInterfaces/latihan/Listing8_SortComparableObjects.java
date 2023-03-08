package com.halimahsya.chapter13_AbstactClassesAndInterfaces.latihan;

import java.math.BigInteger;

public class Listing8_SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"savannah","boston","atalanta","tampa"};
        java.util.Arrays.sort(cities);
        for (String city : cities)
            System.out.print(city + " ");
        System.out.println();

        BigInteger[] hugeNumber = {new BigInteger("2323231092923992"),
        new BigInteger("432232323239292"),
        new BigInteger("54623239292")};

        java.util.Arrays.sort(hugeNumber);
        for (BigInteger number : hugeNumber)
            System.out.println(number + " ");
    }
}
