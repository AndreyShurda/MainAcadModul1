package com.shurda.andrey.Lab2_13.testenum2;

/**
 * Create new project called  TestEnum2. Add package “com.brainacad.oop.testenum2”.
 * Create a class Main with a main(). Create two enum type: Suit (which have SPADE, DIAMOND, CLUB, HEART) and
 * Rank (which have ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING values}.
 * Create class Card which has two private fields: cardSuit of Suit type and cardRank of Rank type.
 * Add to Card constructor with cardSuit and cardRank arguments. In class Card override toString()
 * method to return full name of card. In method main() create and fill (using nested loops)
 * array of Card objects (standard 52card deck).
 * Add code which iterate over Card array and print full card name to console.
 * Execute the program. Example of program output:
 * The Card: KING_HEART .
 * ..
 * The Card: QUEEN_DIAMOND
 * ...
 */
public class Main {
    public static void main(String[] args) {
        Card[] cards = new Card[Suit.values().length * Rank.values().length];

        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[i++] = new Card(suit, rank);
            }
        }

        for (Card card : cards) {
            System.out.println(card);
        }
    }
}
