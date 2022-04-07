package edu.wctc.test;

import edu.wctc.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TheTest {

    @Test
    public void testAdd() {
        Card card = new Card(Faces.ACE, Suits.CLUB);
        assertEquals("the card wrong value", 1, card.getCardValue());
    }

    @Test
    public void testDeck() {
        Deck deck = new Deck();
        assertEquals("Deck wrong size", 52, deck.getSize());
    }

    @Test
    public void testRoyalFlush() {
        Deck deck = new Deck();
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(Faces.TWO,Suits.CLUB));
        cards.add(new Card(Faces.JACK,Suits.CLUB));
        cards.add(new Card(Faces.QUEEN,Suits.CLUB));
        cards.add(new Card(Faces.KING,Suits.CLUB));
        cards.add(new Card(Faces.ACE,Suits.CLUB));
        Hand hand = new Hand(cards);
        assertTrue(CheckHand.isRoyalFlush(hand));
    }

    @Test
    public void testFlush() {
        Deck deck = new Deck();
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(Faces.EIGHT,Suits.CLUB));
        cards.add(new Card(Faces.EIGHT,Suits.CLUB));
        cards.add(new Card(Faces.EIGHT,Suits.CLUB));
        cards.add(new Card(Faces.EIGHT,Suits.CLUB));
        cards.add(new Card(Faces.EIGHT,Suits.CLUB));
        Hand hand = new Hand(cards);
        assertTrue(CheckHand.isFlush(hand));
    }
}
