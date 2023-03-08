package com.halimahsya.chapter13_AbstactClassesAndInterfaces.latihan;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Listing6_TestCalendar {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();
        System.out.println(" waktu pada saat ini adalah " + new Date());
        System.out.println(" tahun : " + calendar.get(Calendar.YEAR));
        System.out.println(" bulan : " + calendar.get(Calendar.MONTH));
        System.out.println(" tanggal : " + calendar.get(Calendar.DATE));
        System.out.println(" jam : " + calendar.get(Calendar.HOUR));
        System.out.println(" perhari dari jam ke : " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(" menit : " + calendar.get(Calendar.MINUTE));
        System.out.println(" detik : " + calendar.get(Calendar.SECOND));
        System.out.println(" perminggu dari hari ke  : " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(" perbulan dari hari ke : " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(" pertahun dari hari ke : " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(" perbulan dari minggu ke : " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println(" pertahun dari minggu ke : " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println(" AM_PM : " + calendar.get(Calendar.AM_PM));

        Calendar calendar1 = new GregorianCalendar(2001,8,11);
        String[] dayNameOfWeek = {"minggu","senin","selasa","rabu","kamis","jumat","sabtu"};
        System.out.println("11 september, 2001 adalah " +
                dayNameOfWeek[calendar1.get(Calendar.DAY_OF_WEEK) -1]);


    }
}
