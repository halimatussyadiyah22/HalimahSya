package com.halimahsya.chapter5.tugas;

public class financial {
    public static void main(String[] args){
        int totalcost =0,tuition = 10000;
        int tuitiontenthyear;
        for (int year = 1; year <= 14; year++) {
            tuition += (tuition * 0.05);
            if (year > 10)
                totalcost += tuition;
            if (year == 10)
                tuitiontenthyear = tuition;
        }
        System.out.println("tuition in ten years : $ " + tuitiontenthyear);


        System.out.println(" total cost for four years worth of tuition " +
                " after the tenth year : $" + totalcost);
    }
}
