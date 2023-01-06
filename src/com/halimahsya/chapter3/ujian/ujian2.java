package com.halimahsya.chapter3.ujian;
import java.util.Scanner;
public class ujian2 {
    public static void main(String[] args){
        String bulan;
        Scanner input= new Scanner(System.in);


        System.out.print(" masukan bulan = ");
        bulan = input.nextLine();
        System.out.print(" masukan tahun = ");
        int tahun = input.nextInt();


        switch( bulan ) {
            case "januari":
            case "maret":
            case "mei":
            case "juli":
            case "agustus":
            case "oktober":
            case "desember":
                System.out.println("pada bulan " + bulan + " tahun " + tahun + " adalah 31 hari ");
                break;
            case "april":
            case "juni":
            case "september":
            case "november":
                System.out.println("pada bulan " + bulan + "tahun" + tahun + " adalah 30 hari ");
                break;
            case "februari":
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    System.out.println("pada bulan " + bulan + " tahun " + tahun + " adalah 29 hari ");
                }else {
                    System.out.println("pada bulan " + bulan + " tahun " + tahun + " adalah 28 hari ");
                }
                break;
            default:
                    System.out.println("silahkan masukan bulan yang benar !");
                break;
        }




        if ((tahun % 4 == 0 && tahun % 100 != 0 ) || (tahun % 400 == 0)){
            System.out.println("tahun ini  merupakan tahun kabisat ");
        }else if (( tahun % 100 != 0 ) || (tahun % 400 == 0))
            System.out.println("tahun ini bukan merupakan tahun kabisat ");
        else
            System.out.println("anda memasukan angka yang salah");


    }


}

