package com.halimahsya.chapter12_ExceptionHnadlingAndText_IO;

import java.util.ArrayList;
import java.util.Scanner;

public class Listing18_WebCrawler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" masukan URL : ");
        String url = input.nextLine();
        crawler(url);
    }
    public static void crawler(String startingURL){
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> ListOfTraversedURLs = new ArrayList<>();
        listOfPendingURLs.add(startingURL);
        while (!listOfPendingURLs.isEmpty() );
    }
}
