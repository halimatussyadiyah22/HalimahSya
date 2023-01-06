package com.halimahsya.chapter3.ujian;
import java.util.Scanner;
    public class ujian4 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            double total,total_bayar,total_cash,kembalian,discon;
            String member;

            System.out.println("Apakah pelanggan termasuk member ? (iya/tidak)");
            member = input.nextLine();
            System.out.println("masukan total belanja = ");
            total = input.nextDouble();


            double a = total * 0.03;
            double b = total* 0.02;

            discon = 0;
            switch(member){
                case "iya":  System.out.println(" Anda merupakan : Member ");
                    if(total >= 500000 )
                        discon= a;
                    else
                        discon =  b;
                    break;

                case "tidak" :  System.out.println(" Anda merupakan : pelanggan biasa ");
                    if(total >= 500000)
                        discon =  b;
                    else

                    break;



            }

            total_bayar = total - discon;

            System.out.println(" total belanja anda adalah : " +  String.format("%.2f",total));
            if(discon == a)
                System.out.println(" Selamat anda mendapatkan potongan harga : " +  String.format("%.2f",discon));
            if (discon == b)
                System.out.println(" Selamat anda mendapatkan potongan harga : " +  String.format("%.2f",discon));

            System.out.println(" total bayar :" +  String.format("%.2f",total_bayar));

            System.out.println("******* CASH SYSTEM *******");
            System.out.println("total cash : " );
            total_cash = input.nextDouble();

            kembalian = total_cash - total_bayar;
            if(total_cash >= total_bayar)
                System.out.println(" kembalian anda : " +  String.format("%.2f",kembalian));
            if (total_cash <= total_bayar )
                System.out.println(" mohon maaf jumlah uang anda kurang " );









        }
}
