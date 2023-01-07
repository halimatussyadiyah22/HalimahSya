package com.halimahsya.chapter3.tugas;
import java.util.Scanner;
public class ComputeAngles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x1,y1,x2,y2,x3,y3,a,b,c,A,B,C;
        System.out.println("Masukan 3 poin : ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();

        a = Math.sqrt((x2 - x3)*(x2 - x3)
                +(y2 - y3) * (y2 -y3));
        b = Math.sqrt((x1 - x3) * (x1 -x3)
                + (y1 - y3) * (y1 -y3));
        c = Math.sqrt((x1 - x2 ) * ( x1 - x2)
                + (y1 -y2 ) * (y1 -y2) );

        A = Math.toDegrees(Math.acos(( a * a - b * b -c*c) / (-2 * b* c)));
        B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        C = Math.toDegrees(Math.acos((c* c - b* b - a* a) / (-2 * a* b)));

        System.out.println(" ke tiga sudut adalah " + Math.round(A * 100)/ 100.0 + " "
                + Math.round(B*100)/ 100.0 + " " + Math.round(C * 100)/ 100.0);
    }
}
