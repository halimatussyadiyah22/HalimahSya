package com.halimahsya.chapter5.tugas;

import java.util.Scanner;

public class Excerxise32_lotre {
    public static void main(String[] args) {
        int lotredijit1, lotredijit2, guess, guessdijit1, guessdijit2;

        lotredijit1 = (int) (Math.random() * 10);

        do {
            lotredijit2 = (int) (Math.random() * 10);
        } while (lotredijit1 == lotredijit2);

        Scanner input = new Scanner(System.in);
        System.out.print(" masukan lotre yang kamu pilih ( 2 dijit yang berbeda ) : ");
        guess = input.nextInt();

        guessdijit1 = guess/10;
        guessdijit2 = guess % 10;

        System.out.println(" nomer lotre adalah " + lotredijit1 +lotredijit2);

        if (guessdijit1 == lotredijit1 && guessdijit2 == lotredijit2)
            System.out.println(" persis sama : memenangkan $10.000 ");
        else if ( guessdijit2 == lotredijit1 && guessdijit1 == lotredijit2){
            System.out.println(" semua digit cocok : kamu menang $3.000");
        } else if (guessdijit1 == lotredijit1 || guessdijit1 == lotredijit2 ||
        guessdijit2 == lotredijit1 || guessdijit2 == lotredijit2) {
            System.out.println(" cocok satu dijit : kamu menang $1.000");
        }else
            System.out.println(" maaf, tidak cocok");

    }
}
