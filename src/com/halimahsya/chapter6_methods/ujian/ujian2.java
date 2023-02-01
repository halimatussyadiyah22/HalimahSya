package com.halimahsya.chapter6_methods.ujian;

import java.util.Scanner;

public class ujian2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----------pilih jenis bangun ruang ------------");
        System.out.println(" A. kubus ");
        System.out.println(" B. balok ");
        System.out.println(" C. tabung ");
        System.out.println(" D. bola ");
        System.out.println(" E. limas kerucut ");

        System.out.println(" pilih rumus yang ingin anda masukan : ");
        String bangunR = input.nextLine();


        switch (bangunR) {
            case "A":
                System.out.println(" masukan sisi kubus ");
                int s = input.nextInt();

                System.out.print(" volume kubus adalah " + kubusV(s) +
                        "\nLuas permukaan kubus adalah " + kubusLs(s));
                break;
            case "B":
                System.out.println(" masukan lebar balok :");
                int l = input.nextInt();
                System.out.println(" masukan panjang balok :");
                int p = input.nextInt();
                System.out.println(" masukan tinggi balok :");
                int t = input.nextInt();
                System.out.print(" volume balok adalah " + balokV(l, p, t) +
                        "\nLuas permukaan balok adalah " + balokLs(l, p, t));
                break;
            case "C":
                System.out.println(" masukan  jari jari tabung : ");
                int r = input.nextInt();
                System.out.println(" masukan tinggi : ");
                int ti = input.nextInt();
                System.out.print(" volume tabung adalah " + tabungV(r, ti) +
                        "\nLuas permukaan tabung adalah " + tabungLs(r, ti));
                break;

            case "D":
                System.out.println(" masukan jari jari bola : ");
                int jr = input.nextInt();
                System.out.print(" volume bola adalah " + bolaV(jr) +
                        "\nLuas permukaan bola adalah " + bolaLs(jr));
                break;

            case "E" :
                System.out.println(" masukan jari jari  ");
                int La = input.nextInt();
                System.out.println(" masukan tinggi :");
                int tk= input.nextInt();
                System.out.println(" masukan s :");
                int sk = input.nextInt();
                System.out.print(" volume kerucut adalah " + kerucutV(La,tk) +
                        "\nLuas permukaan kerucut adalah " + kerucutLs(La,sk));
                break;

        }

    }
    public static double kubusV(double s) {
        double V = 0;
        V = Math.pow(s, 3);

        return V;
    }
    public static double kubusLs( double s){
        double Ls = 0;
        Ls = 6 * Math.pow(s, 2);
        return Ls;
    }
    public static double balokV(double l,double p,double t){
         return l * p*t;

    }
    public static double balokLs(double l, double p,double t){
        return 2 * ((p*l)+(p*t)+(l*t));
    }
    public static double tabungV(double r ,double t){
        return 22/7 * Math.pow(r,2) * t;
    }
    public static double tabungLs(double r , double t){
        return 2 * 22/7 * r * (r + t);
    }
    public static double bolaV(double r){
        return 4/3 * 22/7 * Math.pow(r,3);
    }
    public static double bolaLs(double r){
        return 4 * 22/7 * Math.pow(r,2);
    }
    public static double kerucutV(double r,double t ){
        return (0.3 * 3.14 * Math.pow(r,2)* t);
    }
    public static double kerucutLs(double r ,double s){
        return (22/7 * Math.pow(r,2)) + (22/7 * r * s);
    }
}
