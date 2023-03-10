package com.halimahsya.chapter6_methods.tugas;

public class exercise15_PrintATaxTable {
    public static void main(String[] args) {
        double from = 50000;
        double to = 60000;
        double interval = 50;
        System.out.println(
                "\nTaxable      Single      married joint       married         Head of\n" +
                        "Income                 or Qualifying       separate        a House\n" +
                        "                       widow(er)\n"+
                        "-------------------------------------------------------------------------------");
        for (double taxableIncome = from; taxableIncome <= to; taxableIncome += interval){
            System.out.printf("%-13.0f", taxableIncome);
            System.out.printf("%-12d", Math.round(computetax(0,taxableIncome)));
            System.out.printf("%-20d", Math.round(computetax(1,taxableIncome)));
            System.out.printf("%-15d", Math.round(computetax(2,taxableIncome)));
            System.out.printf("%-10d\n", Math.round(computetax(3,taxableIncome)));
        }
    }
    public static  double computetax( int status , double taxableIncome){
        double tax, taxrate,incometaxed,incomeuntaxed,taxAt15Pecent,taxAt25Pecent,taxAt28Pecent,taxAt33Pecent,taxAt35Pecent;
        taxAt15Pecent = taxAt25Pecent = taxAt28Pecent = taxAt33Pecent = taxAt35Pecent = incomeuntaxed = taxrate = tax = 0.0;
        switch (status) {
            case 0:
                taxAt15Pecent = 8351;
                taxAt25Pecent = 33951;
                taxAt28Pecent = 82251;
                taxAt33Pecent = 171551;
                taxAt35Pecent = 372951;
                break;
            case 1:
                taxAt15Pecent = 16701;
                taxAt25Pecent = 67901;
                taxAt28Pecent = 137051;
                taxAt33Pecent = 208851;
                taxAt35Pecent = 372951;
                break;
            case 2:
                taxAt15Pecent = 8351;
                taxAt25Pecent = 33951;
                taxAt28Pecent = 68526;
                taxAt33Pecent = 104426;
                taxAt35Pecent = 186476;
                break;
            case 3:
                taxAt15Pecent = 11951;
                taxAt25Pecent = 45501;
                taxAt28Pecent = 117451;
                taxAt33Pecent = 190201;
                taxAt35Pecent = 372951;
                break;

        }
        while (taxableIncome >= taxAt15Pecent){
            if (taxableIncome >= taxAt35Pecent){
                taxrate = 0.35;
                incomeuntaxed = taxAt35Pecent - 1;
            }
            else if (taxableIncome >= taxAt33Pecent){
                taxrate = 0.33;
                incomeuntaxed = taxAt33Pecent -1;
            } else if (taxableIncome >= taxAt28Pecent) {
                taxrate = 0.28;
                incomeuntaxed = taxAt28Pecent - 1;

            } else if (taxableIncome >= taxAt25Pecent) {
                taxrate =  0.25;
                incomeuntaxed = taxAt25Pecent-1;
            } else if (taxableIncome >= taxAt15Pecent) {
                taxrate = 0.15;
                incomeuntaxed = taxAt15Pecent-1;
            }
            tax +=(incometaxed = taxableIncome - incomeuntaxed)* taxrate;
            taxableIncome -= incometaxed;
        }
        return tax += taxableIncome * 0.10;
    }
}
