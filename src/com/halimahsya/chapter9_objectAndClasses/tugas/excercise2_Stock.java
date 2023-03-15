package com.halimahsya.chapter9_objectAndClasses.tugas;

public class excercise2_Stock {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL","Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;

        System.out.println("\nStock name: " + stock.name);
        System.out.println("stock symbol: " + stock.symbol);
        System.out.printf("Price-change percentage : %.2f%%\n",stock.getChangePercent());
    }
}
