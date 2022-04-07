package edu.wctc;

public class Card implements Comparable<Card> {
    private Faces face;
    private Suits suit;

    public Card(Faces face, Suits suit) {
        this.face = face;
        this.suit = suit;
    }

    public Faces getFace() {
        return face;
    }

    public Suits getSuit() {
        return suit;
    }

    public boolean sameFace(Card card2) {
        return this.face == card2.face;
    }

    public boolean sameSuit(Card card2) {
        return this.suit == card2.suit;
    }

    @Override
    public int compareTo(Card c) {
        if (this.getCardValue() > c.getCardValue()) {
            return 1;
        } else if (this.getCardValue() == c.getCardValue()) {
            return 0;
        } else {
            return -1;
        }
    }

    public int getCardValue() {
        return this.face.getValue();
    }
}
