package com.halimahsya.chapter5.tugas;

public class Excercise33_4nomerSempurna {
    public static void main(String[] args){

        System.out.println(" 4 nomer sempurna kurang dari 10,000");
        int sum,i,k,nomer;
        for (i = 1; i < 10000; i++){
            sum = 0;
            for (k = 1; k < i; k++){
                if (i%k == 0)
                    sum += k;
            }
            if( i == sum)
                System.out.printf("%20d\n",i);

            for (nomer = 1; nomer <= 10000; nomer++){
                Boolean NomerSempurna = i == sum;
            }
        }
    }
}
