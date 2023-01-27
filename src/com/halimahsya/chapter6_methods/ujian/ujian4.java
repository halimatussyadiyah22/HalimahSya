package com.halimahsya.chapter6_methods.ujian;

import java.util.Scanner;

public class ujian4 {
    public static void main(String[] args) {
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


        System.out.print("-----------------------------------------");
        System.out.print(" Slip Gaji Karyawan Bulan Februari 2023 ");
        System.out.print("------------------------------------------");
        System.out.print("Nama karyawan             :" + nama);
        System.out.print("Status                    :" + status);
        System.out.print("Jumlah anak               :" + anak);
        System.out.print("Jarak rumah-kantor        :" + jarak + "KM");
        System.out.print("Jumlah msk kerja          :" + msk + " hari ");
        System.out.print("Tahun masuk               :" + thn);
        System.out.print("------------------------------------------");
        System.out.print(" gaji pokok   |   T. keluarga    |    T.transportasi    |     T. kesehatan");
        System.out.print("------------------------------------------");
        System.out.printf("%4.1f     ", tgaji(gaji));
        System.out.print("     |      ");
        System.out.printf("%6.3f", tKeluarga(status, anak, gaji));
        System.out.print("     |      ");
        System.out.printf("%-11.1f", tTransportasi(jarak, msk));
        System.out.print("     |      ");
        System.out.printf("%7.3f\n", tkesehatan(thn));
        System.out.print("------------------------------------------");



    }
    public static double tgaji(double gaji){
        return  gaji;
    }

    public static double tKeluarga(String status, int anak, double gaji) {
        double g =0;
        if (status == "menikah" && anak == 0)
          return 0.05 * gaji;
        else if (status == "menikah" && anak <= 3)
           return  0.075 * gaji;
        else if (status == "menikah" && anak >= 3)
           return  0.10 * gaji;
        else if (status == "duda" && anak >= 0)
            return  0.05 * gaji;
        else if (status == "janda" && anak >= 0)
            return  0.075 * gaji;
        else if (status == "duda" && anak == 0)
            return  0.03 * gaji;
        else if (status == "janda" && anak == 0)
           return 0.05 * gaji;
        else
            return 0;


    }
    public static int tTransportasi(int jarak, int msk) {
        if (jarak >= 5)
            return 5000 * msk;
        else if (jarak >= 10)
            return 10000 * msk;
        else if (jarak < 10)
            return 15000 * msk;
        else
            return 0;
    }

    public static int tkesehatan(int thn) {

        int th = 2023 - thn;

        if (th <= 2)
           return   200000;
        else if (th <= 5) {
           return  500000;
        } else if (th > 5) {
            return  750000;
        } else
              return  0;

    }
    public static double totalgaji(){
        double sum = tgaji()
    }
}
