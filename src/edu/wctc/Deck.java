package edu.wctc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> deck;
    private int nextCard = 0;

    public Deck() {
        this.deck = new ArrayList<>();

        for (Suits suit : Suits.values()) {
            for (Faces face : Faces.values()) {
                deck.add(new Card(face, suit));
            }
        }
    }

    public Card getNextCard() {
        if (nextCard >= deck.size()) {
            nextCard = 0;
            this.shuffle();
        }
        return deck.get(nextCard++);
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public int getSize() {
        return this.deck.size();
    }
}
