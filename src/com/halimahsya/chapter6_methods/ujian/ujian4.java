package com.halimahsya.chapter6_methods.ujian;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class ujian4 {
    static SimpleDateFormat montFormat = new SimpleDateFormat("MMMM");
    static SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    static Date date = new Date();
    static String bulan = montFormat.format(date);
    static String tahun = yearFormat.format(date);

    public static void main(String[] args) {
        System.out.println("apalikasi penggajihan karyawan");

        Scanner input = new Scanner(System.in);
        System.out.print("Nama :");
        String nama = input.nextLine();
        System.out.print("status : ");
        String status = input.nextLine();
        System.out.print("jumlah anak :");
        int anak = input.nextInt();
        System.out.print("jarak rmh-kantor : ");
        int jarak = input.nextInt();
        System.out.print("jumlah masuk kerja :");
        int msk = input.nextInt();
        System.out.print("masuk pada tahun :");
        int thn = input.nextInt();
        System.out.print("gaji pokok : ");
        double gaji = input.nextDouble();

        double tkeluarga = tunjanganKeluarga(gaji, status, anak);
        double tTransport = tunjanganTransportasi(msk, jarak);
        double tkesehatan = tunjanganKesehatan(thn);

        double totalGajih = gaji + tkeluarga + tTransport + tkesehatan;

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(" Slip Gaji Karyawan Bulan Februari 2023 ");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Nama karyawan             : " + nama);
        System.out.println("Status                    : " + status);
        System.out.println("Jumlah anak               : " + anak);
        System.out.println("Jarak rumah-kantor        : " + jarak + " KM ");
        System.out.println("Jumlah msk kerja          : " + msk + " hari ");
        System.out.println("Tahun masuk               : " + thn);
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("\t|\tGajih pokok\t|\tT.Keluarga\t|\tT.transportasi\t|\tT.Kesehatan\t|\t");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.printf("\t|t%,d\t|\t%,d\t\t|\t%,d\t\t|\t%,d\t\t|\n", gaji, tkeluarga, tTransport, tkesehatan);
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.print("Total gaji bulan" + bulan + ":     " + totalGajih);
        System.out.println("\n------------------------------------------------------------------------------------------");


    }

    public static int tunjanganKeluarga(double gaji,String status, double anak) {
        double n = 0;
        status = status.toLowerCase();
        if (status == "menikah" || anak == 0)
            n = 0.05 * gaji;
        else if (status == "menikah" || anak <= 3)
            n = 0.075 * gaji;
        else if (status == "menikah" || anak > 3)
            n = 0.10 * gaji;
        else if (status == "duda" || anak >= 1)
            n = 0.05 * gaji;
        else if (status == "janda" || anak >= 1)
            n = 0.075 * gaji;
        else if (status == "duda" || anak == 0)
            n = 0.03 * gaji;
        else if (status == "janda" || anak == 0)
            n = 0.05 * gaji;
        else
            System.out.println("salah");

        return (int) n;
    }

    public static int tunjanganTransportasi(int jarak, double msk) {
        double j = 0;
        if (jarak < 5)
            j = 5000 * msk;
        else if (jarak <= 10)
            j = 10000 * msk;
        else if (jarak > 10)
            j = 15000 * msk;
        else
            System.out.println("salah");
        return (int) j;
    }

    public static int tunjanganKesehatan(int thn) {
        int tahunIni = Integer.parseInt(tahun);

        int th = tahunIni - thn;
        int ks = 0;
        if (th <= 2)
            ks = 200_000;
        else if (th <= 5) {
            ks = 500_000;
        } else if (th > 5) {
            ks = 750_000;
        } else
            System.out.println("salah!");
        return ks;
    }
}








