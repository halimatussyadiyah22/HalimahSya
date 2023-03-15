package com.halimahsya.chapter9_objectAndClasses.tugas;

public class Stock {
    String symbol,name;
    double previousClosingPrice,currentPrice;
    Stock(String newSymbol,String newName){
        symbol = newSymbol;
        name = newName;
    }
    double getChangePercent(){
        return  ((currentPrice - previousClosingPrice)/
                previousClosingPrice)*100;
    }
}
