package com.halimahsya.chapter9_objectAndClasses.tugas;

public class excercise6_Stopwatch {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        int[] randomArray = getArray();
        stopwatch.start();
        selectionSort(randomArray);
        stopwatch.stop();

        System.out.println("the execution timr of sorting 100,000 " + "numbers using selection sort: " + stopwatch.getElapsedTime() + " milliseconds ");
    }
    public static int[] getArray(){
        int[] array = new  int[100000];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100000 );
        }
        return array;
    }
    public static void  selectionSort(int[] array){
        for (int i =  0; i < array.length - 1; i++){
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++){
                if (array[j] < min){
                    min = array[j];
                    minIndex = j;
                }
            }
            if (i != minIndex){
                array[minIndex] = array[i];
                array[i] = min;
            }
    }
}}
