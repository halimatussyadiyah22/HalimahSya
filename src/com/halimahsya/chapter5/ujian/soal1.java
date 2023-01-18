package com.halimahsya.chapter5.ujian;

import com.sun.source.doctree.SeeTree;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);




        System.out.println("_____________MENU________________");
        System.out.println("A. menghitung biner menjadi oktal");
        System.out.println("B. menghitung biner menjadi desimal");
        System.out.println("C. menghitung biner menjadi heksa ");
        System.out.println("D. menghitung oktal menjadi biner ");
        System.out.println("E. menghitung oktal menjadi desimal ");
        System.out.println("F. menghitung oktal menjadi heksa ");
        System.out.println("G. menghitung desimal menjadi biner ");
        System.out.println("H. menghitung desimal menjadi oktal ");
        System.out.println("I. menghitung desimal menjadi heksa ");
        System.out.println("J. menghitung heksa menjadi biner ");
        System.out.println("K. menghitung heksa menjadi oktal ");
        System.out.println("L. menghitung heksa menjadi desimal ");
        System.out.println("====================================");

        System.out.print(" masukan menu yang anda inginkan = ");
          String menu = input.nextLine();

          switch(menu){
              case "A" : System.out.println("menghitung biner menjadi oktal" +
                      " maka masukan angka biner = ");
                  long biner = input.nextLong();

                          int i,nilaiOktal=0,nilaidesimal=0;
                          for( i = 1; biner != 0; biner = biner / 10,i = i * 2){
                              nilaidesimal = (int)(nilaidesimal + (biner%10)*i);
                          }for (i = 1; nilaidesimal != 0; i = i * 10){
                              nilaiOktal = nilaiOktal + (nilaidesimal%8)*i;
                              nilaidesimal = nilaidesimal/8;
              }
                  System.out.println( " di konversasikan menjadi oktal adalah " + nilaiOktal );
                  break;
              case "B" : System.out.println("menghitung biner menjadi desimal " +
                      " maka masukan angka biner = ");
              int nilaibiner = input.nextInt();

              int temp, sisa ,desimal=0,n=0;
                  temp = nilaibiner;
              while(temp> 0){
                  sisa =  temp % 10;
                  desimal =(int) (desimal + sisa * Math.pow(2,n));
                   temp = temp /10;
                  n++;
              }
                  System.out.println( "angka biner " + nilaibiner + " di konversasikan menjadi desimal adalah " + desimal );
              break;



              case "C" : System.out.println("menghitung biner menjadi heksa" +
                      " maka masukan angka biner = ");
              nilaibiner = input.nextInt();

                if( nilaibiner == 0 )
                    System.out.print("0");
                  else if( nilaibiner == 1 )
                       System.out.print("1");
                  else if(  nilaibiner == 10 )
                      System.out.print(" 2 ");
                   else if(  nilaibiner == 11 )
                       System.out.print(" 3 ");
                   else if(  nilaibiner == 100 )
                       System.out.print(" 4 ");
                   else if(  nilaibiner == 101 )
                       System.out.print(" 5 ");
                   else if(  nilaibiner == 110 )
                       System.out.print(" 6 ");
                   else if(  nilaibiner == 111 )
                       System.out.print(" 7 ");
                   else if(  nilaibiner == 1000 )
                       System.out.print(" 8 ");
                   else if(  nilaibiner == 1001 )
                       System.out.print(" 9 ");
                   else if( nilaibiner == 1010 )
                       System.out.print(" A ");
                   else if(  nilaibiner == 1011 )
                       System.out.print(" B ");
                   else if(  nilaibiner == 1100 )
                       System.out.print(" C ");
                   else if(  nilaibiner == 1101 )
                       System.out.print(" D ");
                   else if(  nilaibiner == 1110 )
                       System.out.print(" E");
                   else if(  nilaibiner == 1111 )
                       System.out.print(" F");
                   else
                    System.out.println("salah");
                      break;

              case "D" : System.out.println("menghitung Oktal menjadi biner" +
                      " maka masukan angka oktal = ");
              nilaiOktal = input.nextInt();
              int j,nilaiDesimal=0;
              long nilaiBiner = 0;
              i = 0;

              while (nilaiOktal != 0){
                  nilaiDesimal = (int) (nilaiDesimal + (nilaiOktal%10)*Math.pow(8,i++));
                  nilaiOktal = nilaiOktal/10;
              }
              j = 1;
              while (nilaiDesimal !=0){
                  nilaiBiner = nilaiBiner +(nilaiDesimal%2)*j;
                  nilaiDesimal = nilaiDesimal/2;
                  j=j*10;
              }
              System.out.println(" di konversasikan menjadi biner adalah " +  nilaiBiner );
                  break;
              case "E" : System.out.println("menghitung oktal menjadi desimal" +
                      " maka masukan angka oktal = ");
              nilaiOktal = input.nextInt();

              desimal = 0;
              n = 0;
              temp = nilaiOktal;
              while (temp >0){
                  sisa = temp%10;
                  desimal =(int) (desimal + sisa * Math.pow(8,n));
                  temp = temp/10;
                  n++;
              }
                  System.out.println(" di konversasikan menjadi desimal adalah " + desimal);
                  break;

              case "F" : System.out.println("menghitung oktal menjadi heksa " +
                      " maka masukan angka oktal = ");
              nilaiOktal = input.nextInt();

              char[] hexadesimal = new char[20];
              desimal=0;
              i=0;
              while (nilaiOktal!=0){
                  sisa = nilaiOktal%10;
                  desimal = (int) (desimal+(sisa*Math.pow(8, i)));
                  i++;
                  nilaiOktal = nilaiOktal/10;
              }
              while (desimal!= 0){
                  sisa = desimal%16;
                  if (sisa<10)
                      sisa = sisa+48;
                  else
                      sisa = sisa + 55;
                  hexadesimal[i] = (char) sisa;
                  i++;
                  desimal = desimal/16;
              }
                  System.out.println(" di konversasikan menjadi heksa adalah " );
              for (i=(i-1); i>=0; i--)
                  System.out.print(hexadesimal[i]);
                  break;

              case "G" : System.out.println("menghitung desimal menjadi biner" +
                      " maka masukan angka desimal = ");
              nilaiDesimal = input.nextInt();

              i = 1;
              int Nilaibiner[] = new int[30];
              while (nilaiDesimal != 0){
                  Nilaibiner[i++] = nilaiDesimal%2;
                  nilaiDesimal = nilaiDesimal/2;
              }
                  System.out.println(" di konversasikan menjadi biner adalah " );
              j = i - 1;
              while (j>0){
                  System.out.print(Nilaibiner[j]);
                  j--;
              }
              break;
              case "H" : System.out.println("menghitung desimal menjadi oktal" +
                      " maka masukan angka desimal = ");
              nilaiDesimal = input.nextInt();

              i = 1;
              int[] nilaioktal = new int[10];
              temp = nilaiDesimal;
              while (temp != 0){
                  nilaioktal[i++]= temp % 8;
                  temp = temp / 8;
              }
                  System.out.println(" di konversasikan menjadi oktal adalah " );
              for(j = i -1; j > 0; j--){
                  System.out.print(nilaioktal[j]);
              }
              break;
              case "I" : System.out.println("menghitung desimal menjadi heksa " +
                      " maka masukan angka desimal = ");
              nilaiDesimal = input.nextInt();

              char ch[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
              String hexdesimal ="";

              while (nilaiDesimal != 0){
                  sisa = nilaiDesimal%16;
                  hexdesimal = ch[sisa] + hexdesimal;
                  nilaiDesimal = nilaiDesimal/16;
              }
                  System.out.println(" di konversasikan menjadi oktal adalah " + hexdesimal);


              case "J" : System.out.println("menghitung hexa menjadi biner" +
                      " maka masukan angka hexa = ");
                  String nilaiokktal = input.nextLine();
                  if(nilaiokktal.length() != 1) {
                      System.out.println(" kamu harus memasukan nomer yang benar ");
                      System.exit(1);
                  }
                  char nilai = nilaiokktal.charAt(0);
                  if ((nilai >= 'A' && nilai <= 'F' ) || (nilai >= 0 && nilai <= 9)) {
                      System.out.println(" dikonversikan menjadi oktal ");
                      switch (nilai) {
                          case 0:
                              System.out.println(0000);
                              break;
                          case 1:
                              System.out.println(0001);
                              break;
                          case 2:
                              System.out.println(0010);
                              break;
                          case 3:
                              System.out.println(0011);
                              break;
                          case 4:
                              System.out.println(0100);
                              break;
                          case 5:
                              System.out.println(0101);
                              break;
                          case 6:
                              System.out.println(0110);
                              break;
                          case 7:
                              System.out.println(0111);
                              break;
                          case 8:
                              System.out.println(1000);
                              break;
                          case 9:
                              System.out.println(1001);
                              break;
                          case 'A':
                              System.out.println(1010);
                              break;
                          case 'B':
                              System.out.println(1011);
                              break;
                          case 'C':
                              System.out.println(1100);
                              break;
                          case 'D':
                              System.out.println(1100);
                              break;
                          case 'E':
                              System.out.println(1101);
                              break;
                          case 'F':
                              System.out.println(1111);
                              break;
                      }
                  }else
                      System.out.println( " anda salah ");
                  break;

                      case "K":


                          int decimal=0, rem, len;
                          String hexadecimal;
                          int[] octal = new int[20];

                          System.out.println("menghitung hexa menjadi oktal" +
                                  " maka masukan angka hexa = ");
                          hexadecimal = input.nextLine();

                          len = hexadecimal.length();
                          len--;

                          i =0;

                          while(len>=0)
                          {
                              rem = hexadecimal.charAt(len);
                              if(rem>=48 && rem<=57)
                                  rem = rem-48;
                              else if(rem>=65 && rem<=70)
                                  rem = rem-55;
                              else if(rem>=97 && rem<=102)
                                  rem = rem-87;
                              else
                              {
                                  System.out.println("\nInvalid Hexadecimal Digit!");
                                  return;
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
                          break;
              case "L":
                  System.out.print("menghitung hexa menjadi desimal" +
                          " maka masukan angka oktal = ");
                  String hexa = input.nextLine();


                  desimal =0;
                          i = 0;
                  len = hexa.length();

                  len--;
                  while (len>=0){
                      rem = hexa.charAt(len);
                      if (rem>= 48 && rem<= 57)
                          rem = rem-48;
                                  else if ( rem >= 65 && rem <= 70)
                                      rem = rem - 55;
                                  else if ( rem>= 97 && rem <= 102)
                                      rem = rem - 87;
                                  else {
                          System.out.println(" salah ");
                          return;
                      }
                          desimal = (int) (desimal + (rem*Math.pow(16,i)));
                                  i++;
                                  len--;
                  }
                  System.out.println(" konversasi dari hexa ke desimal adalah " + desimal);
break;







                  }
          }



                  }





















