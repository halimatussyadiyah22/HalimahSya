package com.halimahsya.chapter9_objectAndClasses.latihan;

import com.halimahsya.chapter2.tugas.Circle;

public class Listing7_TestCircleWithMembers {
    public static void main(String[] args) {
        System.out.println(" sebelum membuat objek ");
        System.out.println(" jumlah dari objek lingkaran adalah " +
        Listing6_CircleWithStaticMembers.numberOfObjects );

        Listing6_CircleWithStaticMembers c1 = new Listing6_CircleWithStaticMembers();

        System.out.println("\nsetelah membuat c1 ");
        System.out.println(" c1 : radius ( " + c1.radius + " ) dan jumlah dari objek lingkaran (" + c1.numberOfObjects + ")" );

        Listing6_CircleWithStaticMembers c2 = new Listing6_CircleWithStaticMembers(5);

        c1.radius = 9;

        System.out.println("\nSetelah membuat c2 dan memindahkan c1 ");
        System.out.println("c1 : radius ( " + c1.radius + ") dan jumlah dari objek lingkaran (" + c1.numberOfObjects +
                ")");
        System.out.println("c2 : radius ( " + c2.radius + ") dan jumlah dari objek lingkaran (" + c2.numberOfObjects +
                ")");


    }
}
