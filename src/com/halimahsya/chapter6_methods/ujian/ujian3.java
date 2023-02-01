package com.halimahsya.chapter6_methods.ujian;

import java.util.Scanner;

public class ujian3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_____________ Menu ______________");
        System.out.println(" A. menhitung biner menjadi oktal ");
        System.out.println(" A. menhitung biner menjadi desimal ");
        System.out.println(" A. menhitung biner menjadi heksa ");
        System.out.println(" A. menhitung oktal menjadi biner ");
        System.out.println(" A. menhitung oktal menjadi desimal ");
        System.out.println(" A. menhitung oktal menjadi heksa ");
        System.out.println(" A. menhitung desimal menjadi biner ");
        System.out.println(" A. menhitung desimal menjadi oktal ");
        System.out.println(" A. menhitung desimal menjadi heksa ");
        System.out.println(" A. menhitung heksa menjadi biner ");
        System.out.println(" A. menhitung heksa menjadi oktal ");
        System.out.println(" A. menhitung heksa menjadi desimal ");
        System.out.println("======================================");

        System.out.println(" masukan menu yang anda inginkan : ");
        String menu = input.nextLine();

        switch (menu){
            case " A " :
                System.out.println(" menghitung biner menjadi oktal" + "\n masukan angka biner : ");
                long biner = input.nextLong();
                System.out.println(" di komversasikan menjadi oktal adalah " + nilaiOktal1(biner));
                break;
            case "B" :
                System.out.println(" menghitung biner menjadi desimal" + "\n masukan angka biner : ");
                int nilaibiner = input.nextInt();
                System.out.println(" di komversasikan menjadi desimal adalah " + nilaidesimal1(nilaibiner));
                break;
            case "C" :
                System.out.println(" menghitung biner menjadi heksa " + "\n masukan angka biner : ");
                int nbiner = input.nextInt();
                System.out.println(" di komversasikan menjadi heksa adalah " + nilaiheksa1(nbiner));
                break;
            case "D" :
                System.out.println(" menghitung oktal menjadi biner" + "\n masukan angka oktal : ");
                int oktal = input.nextInt();
                System.out.println(" di komversasikan menjadi  biner adalah " + nilaibiner1(oktal));
                break;
            case "E" :
                System.out.println(" menghitung oktal menjadi desimal" + "\n masukan angka oktal : ");
                int nilaioktal = input.nextInt();
                System.out.println(" di komversasikan menjadi desimal adalah " + nilaidesimal2(nilaioktal));
                break;
            case "F" :
                System.out.println(" menghitung oktal menjadi heksa " + "\n masukan angka oktal : ");
                int noktal = input.nextInt();
                System.out.println(" di komversasikan menjadi heksa adalah " + nilaiheksa2(noktal));
                break;
            case "G" :
                System.out.println(" menghitung desimal menjadi biner" + "\n masukan angka desimal : ");
                int desimal = input.nextInt();
                System.out.println(" di komversasikan menjadi biner adalah " + nilaibiner2(desimal));
                break;
            case "H" :
                System.out.println(" menghitung  desimal menjadi oktal" + "\n masukan angka desimal : ");
                int nilaidesimal = input.nextInt();
                System.out.println(" di komversasikan menjadi oktal adalah " + nilaioktal2(nilaidesimal));
                break;
            case "I" :
                System.out.println(" menghitung desimal menjadi heksa" + "\n masukan angka desimal : ");
                int ndesimal = input.nextInt();
                System.out.println(" di komversasikan menjadi desimal adalah " + nilaiheksa3(ndesimal));
                break;
            case "J" :
                System.out.println(" menghitung  heksa menjadi biner " + "\n masukan angka heksa : ");
                int heksa = input.nextInt();
                System.out.println(" di komversasikan menjadi biner adalah " + nilaibiner3(heksa));
                break;
            case "K" :
                System.out.println(" menghitung heksa menjadi oktal" + "\n masukan angka heksa : ");
                int nilaiheksa = input.nextInt();
                System.out.println(" di komversasikan menjadi  oktal adalah " + nilaioktal3(nilaiheksa));
                break;
            case "G" :
                System.out.println(" menghitung  heksa menjadi desimal" + "\n masukan angka heksa : ");
                int nheksa = input.nextInt();
                System.out.println(" di komversasikan menjadi desimal adalah " + nilaidesimal3(nheksa));
                break;
            default:
        }
    }
    public static long nilaiOktal1(long biner){
        int nilaidesimal=0, nilaioktal = 0;
        for(int i =1; biner != 0; biner = biner/ 10,i = i*2){
            nilaidesimal = (int)(nilaidesimal + (biner%10)*1);
        }for (int i = 1; nilaidesimal != 0; i = i * 10){
            nilaioktal = nilaioktal + (nilaidesimal%8)*i;
            nilaidesimal = nilaidesimal/8;

        }
        return nilaioktal;
    }
    public static int nilaidesimal1(int biner){
        int temp, sisa ,desimal=0,n=0;
        temp = biner;
        while(temp> 0){
            sisa =  temp % 10;
            desimal =(int) (desimal + sisa * Math.pow(2,n));
            temp = temp /10;
            n++;
        }return desimal;

    }
    public static String nilaiheksa1(int biner){
        String n;
        if( biner == 0 )
              n = "0";
        else if( biner == 1 )
             n  = "1" ;
        else if(  biner == 10 )
             n = "2"  ;
        else if(  biner == 11 )
            n = "3" ;
        else if(  biner == 100 )
            n= "4"  ;
        else if(  biner == 101 )
            n= "5"  ;
        else if(  biner == 110 )
            n= "6"  ;
        else if(   biner == 111 )
             n= "7" ;
        else if(   biner == 1000 )
             n= "8"  ;
        else if(   biner == 1001 )
             n= "9"  ;
        else if(  biner == 1010 )
           n = "A"  ;
        else if(   biner == 1011 )
            n= "B"  ;
        else if(   biner == 1100 )
             n = " C " ;
        else if(   biner == 1101 )
             n=" D " ;
        else if(   biner == 1110 )
            n=" E" ;
        else if(   biner == 1111 )
             n=" F";
        else
             n ="salah";
         return n;

    }
    public static long nilaibiner1(int oktal){
        int j,nilaidesimal=0,i=0;
        long nilaibiner =0;

        while (oktal != 0){
            nilaidesimal = (int) (nilaidesimal + (oktal%10)*Math.pow(8,i++));
            oktal = oktal/10;
        }
        j = 1;
        while (nilaidesimal != 0){
            nilaibiner = nilaibiner + (nilaidesimal%2)*j;
            nilaidesimal = nilaidesimal/2;
            j=j*10;

        }
        return nilaibiner;
    }
    public static int nilaidesimal2(int oktal){
        int desimal=0,n=0;
        int temp = oktal;
        while (temp > 0){
            int sisa = temp%10;
            desimal =(int) (desimal + sisa * Math.pow(8,n));
            temp= temp/10;
            n++
        }
        return desimal;
    }
    public static int nilaiheksa2(int oktal){
        int desimal =0,i=0,temp=oktal;
        char[] hexadesimal = new char[20];
        while (oktal != 0){
            int sisa = oktal%10;
            desimal = (int) (desimal+(sisa*Math.pow(8,i)));
            i++;
            oktal = oktal/10;
        }
        while (desimal != 0){
            int sisa =
        }
    }


}
