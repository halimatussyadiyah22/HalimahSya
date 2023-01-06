package com.halimahsya.chapter2.latihan;

import java.util.Scanner;
    public class DisplayTime {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter an integar for second: ");
            int second = input.nextInt();

            int minute = second / 60; 
            int remainingSeconds = second % 60;
            System.out.println(second + "second is" + "minutes" + 
                "minutes and " + remainingSeconds + " second");
        } 
     
}
