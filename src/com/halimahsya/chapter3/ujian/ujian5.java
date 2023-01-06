package com.halimahsya.chapter3.ujian;
import java.util.Scanner;

public class ujian5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan nilai kehadiran = ");
        double nk = input.nextDouble();
        System.out.print(" masukan nilai tugas = ");
        double nt = input.nextDouble();
        System.out.print("masukan nilai UTS = ");
        double uts = input.nextDouble();
        System.out.print("masukan nilai UAS = ");
        double uas = input.nextDouble();
        System.out.print("masukan nilai projek akhir = ");
        double pa = input.nextDouble();

        double hadir = 0.05 * nk;
        double tugas = 0.20 * nt;
        double Nuts = 0.20 * uts;
        double Nuas = 0.25 * uas;
        double Npa = 0.30 * pa;
        double NilaiAkhir = (hadir + tugas + Nuts + Nuas + Npa);

        if(NilaiAkhir >= 90)
            System.out.print(" Selamat anda LULUS dengan nilai A ");
        else if(NilaiAkhir >= 85)
            System.out.print(" Selamat anda LULUS dengan nilai B+ ");
        else if(NilaiAkhir >= 80)
            System.out.print(" Selamat anda LULUS dengan nilai B ");
        else if(NilaiAkhir>= 75)
            System.out.print(" Selamat anda LULUS dengan nilai B- ");
        else if(NilaiAkhir >= 70)
            System.out.print(" Selamat anda LULUS dengan nilai C+ ");
        else if(NilaiAkhir>= 65)
            System.out.print(" Selamat anda LULUS dengan nilai C ");
        else if(NilaiAkhir>= 60)
            System.out.print(" Selamat anda LULUS dengan nilai C- ");
        else if(NilaiAkhir >= 50)
            System.out.println(" Nilai anda D dinyatakan TIDAK LULUS" );
        else
            System.out.println(" Nilai anda E dinyatakan TIDAK LULUS" );

        if(NilaiAkhir <= 60)
            System.out.println(" Anda harus mengulangi matkul ini ");

    }

}

