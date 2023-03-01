package com.halimahsya.chapter10_ObjectOrientedThinking.latihan;

public class Listing8_StackOfIntegar {
        private int[] elements;
        private int size;
        public static final int DEFAULT_CAPACITY = 16;

        public Listing8_StackOfIntegar() {
            this(DEFAULT_CAPACITY);
    }
    public Listing8_StackOfIntegar(int capacity){
            elements = new int[capacity];
    }
    public void push(int value){
            if (size >= elements.length){
                int[] temp = new int[elements.length* 2];
                System.arraycopy(elements,0,temp,0,elements.length);
            }
            elements[size++] = value;
    }
    public  int pop(){
            return elements[--size];
    }
    public int peek(){
            return elements[size - 1];
    }
    public boolean empty(){
            return  size == 0;
    }
    public int getSize(){
            return  size;
    }

    public static class Listing9_LargeFactorial {
    }
}
