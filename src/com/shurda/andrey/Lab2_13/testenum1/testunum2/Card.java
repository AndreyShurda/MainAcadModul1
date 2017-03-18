package com.shurda.andrey.Lab2_13.testenum1.testunum2;

public class Card {
    private Suit cardSuit;
    private Rank cardRank;

    public Card(Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    @Override
    public String toString() {
        return "The Card: " + cardSuit + "_" + cardRank;
    }
}
