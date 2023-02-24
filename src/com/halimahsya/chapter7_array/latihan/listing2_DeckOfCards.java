package com.halimahsya.chapter7_array.latihan;

public class listing2_DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"spades","hearts","diamonds","clubs"};
        String[] ranks = {"ace","2","3","4","5","6","7","8","9","10","jack","queen","king"};

        for (int i = 0; i < deck.length; i++)
            deck[i] = i;
        for (int i = 0; i < deck.length; i++){
            int index = (int) (Math.random()* deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;

        }
        for (int i = 0; i <4;i++){
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("card number " + deck[i] + ": " + rank + " of " + suit);
        }
    }
}
