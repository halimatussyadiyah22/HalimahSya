package com.halimahsya.chapter6_methods;

import java.util.Scanner;

public class i {
    public static void main(String[] args){

          int[] noAsli = new int[]{1,4,7,2,9};
          int temp = 0;

          for (int i =0; i < noAsli.length; i++){
              for (int j = i+1; j < noAsli.length; j++){
                  if (noAsli[i] > noAsli[j]){
                      temp = noAsli[i];
                      noAsli[i] = noAsli[j];
                      noAsli[j] = temp;
                  }
              }
          }
        System.out.println();
          for (int i = 0; i < noAsli.length; i++){
              System.out.print(noAsli[i] + " ");
          }
    }
}
