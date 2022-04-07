package edu.wctc;

import java.util.Collections;
import java.util.List;

public class Hand {

    private List<Card> hand;

    public Hand(List<Card> hand) {
        this.hand = hand;
    }

    public Hand(Card card1, Card card2) {
        hand.add(card1);
        hand.add(card2);
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }

    public List<Card> getHand() {
        Collections.sort(hand);
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }
}
