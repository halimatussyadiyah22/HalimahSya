package com.halimahsya.myextraordinary;

import java.util.Scanner;

public class ch6_u3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_____________ Menu ______________");
        System.out.println(" A. menhitung biner menjadi oktal ");
        System.out.println(" B. menhitung biner menjadi desimal ");
        System.out.println(" C. menhitung biner menjadi heksa ");
        System.out.println(" D. menhitung oktal menjadi biner ");
        System.out.println(" E. menhitung oktal menjadi desimal ");
        System.out.println(" F. menhitung oktal menjadi heksa ");
        System.out.println(" G. menhitung desimal menjadi biner ");
        System.out.println(" H. menhitung desimal menjadi oktal ");
        System.out.println(" I. menhitung desimal menjadi heksa ");
        System.out.println(" J. menhitung heksa menjadi biner ");
        System.out.println(" K. menhitung heksa menjadi oktal ");
        System.out.println(" L. menhitung heksa menjadi desimal ");
        System.out.println("======================================");

        System.out.println(" masukan menu yang anda inginkan : ");
        String menu = input.nextLine();

        switch (menu) {
            case "A":
                System.out.println(" menghitung biner menjadi oktal" + "\n masukan angka biner : ");
                long biner = input.nextLong();
                System.out.println(" di komversasikan menjadi oktal adalah " + nilaiOktal1(biner));
                break;
            case "B":
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
                nilaibiner2(desimal);
                break;
            case "H" :
                System.out.println(" menghitung  desimal menjadi oktal" + "\n masukan angka desimal : ");
                int nilaidesimal = input.nextInt();
                nilaioktal2(nilaidesimal);
                break;
            case "I" :
                System.out.println(" menghitung desimal menjadi heksa" + "\n masukan angka desimal : ");
                int ndesimal = input.nextInt();
                System.out.println(" di komversasikan menjadi desimal adalah " + nilaiheksa3(ndesimal));
                break;
            case "J" :
                System.out.println(" menghitung  heksa menjadi biner " + "\n masukan angka heksa : ");
                String heksa = input.nextLine();
                nilaibiner3(heksa);
                break;
            case "K" :
                System.out.println(" menghitung heksa menjadi oktal" + "\n masukan angka heksa : ");
                String nilaiheksa = input.nextLine();
                nilaioktal3(nilaiheksa);
                break;
            case "L" :
                System.out.println(" menghitung  heksa menjadi desimal" + "\n masukan angka heksa : ");
                String nheksa = input.nextLine();
                System.out.println(" di komversasikan menjadi desimal adalah " + nilaidesimal3(nheksa));
                break;
            default:
                System.out.println("salah");
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
            n++;
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
            int sisa = desimal%10;
            if (sisa<10)
                sisa = sisa + 48;
            else
                sisa = sisa+55;
            hexadesimal[i] = (char) sisa;
            i++;
            desimal = desimal/16;
            for (i=(i-1);i>= 10;i--);
        }

        return hexadesimal[i];
    }
    public static void nilaibiner2(int desimal){
        int i = 1;
        int nilaibiner[] = new int[30];
        while (desimal != 0){
            nilaibiner[i++]= desimal%2;
            desimal = desimal/2;
        }System.out.println(" di komversasikan menjadi biner adalah ");
        int j = i -1;
        while (j>0) {
            System.out.print(nilaibiner[j]);
            j--;
        }
    }
    public static void nilaioktal2(int desimal){
        int i = 1;
        int[] nilaioktal = new int[10];
        int temp = desimal;
        while (temp != 0){
            nilaioktal[i++] = temp % 8;
            temp = temp/8;
        }
        for (int j = i -1; j>0; j--) {
            System.out.println(" di komversasikan menjadi oktal adalah " + nilaioktal[j]);
        }
    }
    public static String nilaiheksa3(int desimal){
        char ch[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String heksa ="";
        while (desimal != 0){
            int sisa = desimal% 16;
            heksa = ch[sisa] + heksa;
            desimal = desimal/16;
        }return heksa;
    }
    public static void nilaibiner3(String heksa) {
        if(heksa.length() != 1) {
            System.out.println(" kamu harus memasukan nomer yang benar ");
            System.exit(1);
        }
        char nilai = heksa.charAt(0);
        if ((nilai >= 'A' && nilai <= 'F') || (nilai >= '0' && nilai <= '9')) {
            System.out.println(" di komversasikan menjadi biner adalah ");
            switch (nilai) {
                case '0':
                    System.out.println("0");
                    break;
                case '1':
                    System.out.println("1");
                    break;
                case '2':
                    System.out.println("10");
                    break;
                case '3':
                    System.out.println("11");
                    break;
                case '4':
                    System.out.println("100");
                    break;
                case '5':
                    System.out.println("101");
                    break;
                case '6':
                    System.out.println("110");
                    break;
                case '7':
                    System.out.println("111");
                    break;
                case '8':
                    System.out.println("1000");
                    break;
                case '9':
                    System.out.println("1001");
                    break;
                case 'A':
                    System.out.println("1010");
                    break;
                case 'B':
                    System.out.println("1011");
                    break;
                case 'C':
                    System.out.println(" 1100 ");
                    break;
                case 'D':
                    System.out.println(" 1101 ");
                    break;
                case 'E':
                    System.out.println(" 1110");
                    break;
                case 'F':
                    System.out.println(" 1111");
                    break;


            }
        }else
            System.out.println("salah");
    }
    public static void nilaioktal3(String heksa){
        int decimal=0, rem, len;

        int[] octal = new int[20];

        len = heksa.length();
        len--;

        int i =0;

        while(len>=0)
        {
            rem = heksa.charAt(len);
            if(rem>=48 && rem<=57)
                rem = rem-48;
            else if(rem>=65 && rem<=70)
                rem = rem-55;
            else if(rem>=97 && rem<=102)
                rem = rem-87;
            else
            {
                System.out.println("\nInvalid Hexadecimal Digit!");

            }
            decimal = (int) (decimal + (rem*Math.pow(16, i)));
            i++;
            len--;
        }

        i=0;
        while(decimal!=0)
        {
            octal[i] = decimal%8;
            i++;
            decimal = decimal/8;
        }

        System.out.print("\nkonversi hexa menjadi oktal adalah = ");
        for(i=(i-1); i>=0; i--)
            System.out.print(octal[i]);

    }
    public static int nilaidesimal3(String heksa){
        int desimal = 0,i = 0,len = heksa.length();
        len--;
        while (len>=0){
            int rem = heksa.charAt(len);
            if (rem>= 48 && rem <= 57)
                rem = rem -48;
            else if (rem >= 65 && rem <= 70)
                rem = rem - 55;
            else if (rem >= 97 && rem <= 102 )
                rem = rem -87;
            else
                System.out.println("salah");

            desimal= (int) (desimal+(rem*Math.pow(16,i)));
            i++;
            len--;
        }
        return desimal;

    }
}







