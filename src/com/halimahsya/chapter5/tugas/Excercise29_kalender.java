package com.halimahsya.chapter5.tugas;

import java.util.Scanner;

public class Excercise29_kalender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" masukan tahun : ");
        int tahun = input.nextInt();
        System.out.print(" masukan hari pertama dari tahun : ");
        int hari = input.nextInt();

        String header;
        System.out.println();
        for (int bulan = 1; bulan <= 12; bulan++) {
            header = "";
            switch (bulan) {
                case 1:
                    header += " januari ";
                    break;
                case 2:
                    header += " februari ";
                    break;
                case 3:
                    header += " maret ";
                    break;
                case 4:
                    header += " april ";
                    break;
                case 5:
                    header += " mei ";
                    break;
                case 6:
                    header += " juni ";
                    break;
                case 7:
                    header += " juli ";
                    break;
                case 8:
                    header += " agustus ";
                    break;
                case 9:
                    header += " september ";
                    break;
                case 10:
                    header += " oktober ";
                    break;
                case 11:
                    header += " november";
                    break;
                case 12:
                    header += " desember ";
                    break;

            }
            header += tahun + "";
            for (int b = 0; b < 23 - (header.length() / 2); b++) {
                System.out.print(" ");
            }
                System.out.println(header +
                        "\n------------------------------------------------------------------\n" + "ming    sen    sel    rab   kam    jum    sab ");
                hari %= 7;
                for (int b = 0; b <= hari * 7; b++) {
                    System.out.print(" ");
                }
                int hariterakhir = 0;
                if (bulan == 1 || bulan == 3 || bulan == 5 || bulan == 7 ||
                        bulan == 8 || bulan == 10 || bulan == 12) {
                    hariterakhir += 31;
                } else if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) {
                    hariterakhir += 30;
                } else {
                    if (((tahun % 4 == 0) && (tahun % 100 != 0)) || (tahun % 400 == 0)) {
                        hariterakhir += 29;
                    } else
                        hariterakhir += 28;
                }
                for (int d = 1; d <= hariterakhir; d++) {
                    if (d < 10)
                        System.out.print(" ");
                    if (hari % 7 == 6)
                        System.out.print(d + "\n ");
                    else {
                        System.out.print(d + "     ");
                        if (d == hariterakhir)
                            System.out.println();
                    }
                    hari++;
                }
                System.out.println();
            }
        }

    }
