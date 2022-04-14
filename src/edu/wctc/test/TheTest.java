package edu.wctc.test;

import edu.wctc.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

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
        cards.add(new Card(Faces.KING, Suits.CLUB));

        cards.add(new Card(Faces.TEN, Suits.CLUB));
        cards.add(new Card(Faces.JACK, Suits.CLUB));
        cards.add(new Card(Faces.QUEEN, Suits.CLUB));
        cards.add(new Card(Faces.ACE, Suits.CLUB));
        Hand hand = new Hand(cards);
        assertTrue(CheckHand.isRoyalFlush(hand));
    }

    @Test
    public void testNotRoyalFlush() {
        Deck deck = new Deck();
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(Faces.TWO, Suits.CLUB));
        cards.add(new Card(Faces.JACK, Suits.CLUB));
        cards.add(new Card(Faces.QUEEN, Suits.CLUB));
        cards.add(new Card(Faces.KING, Suits.CLUB));
        cards.add(new Card(Faces.ACE, Suits.CLUB));
        Hand hand = new Hand(cards);
        assertFalse(CheckHand.isRoyalFlush(hand));
    }

    @Test
    public void testFlush() {
        Deck deck = new Deck();
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(Faces.EIGHT, Suits.CLUB));
        cards.add(new Card(Faces.EIGHT, Suits.CLUB));
        cards.add(new Card(Faces.EIGHT, Suits.CLUB));
        cards.add(new Card(Faces.EIGHT, Suits.CLUB));
        cards.add(new Card(Faces.EIGHT, Suits.CLUB));
        Hand hand = new Hand(cards);
        assertTrue(CheckHand.isFlush(hand));
    }

    @Test
    public void testIsFourOfAKind() {
        Deck deck = new Deck();
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(Faces.FOUR, Suits.CLUB));
        cards.add(new Card(Faces.FOUR, Suits.DIAMOND));
        cards.add(new Card(Faces.FOUR, Suits.SPADE));
        cards.add(new Card(Faces.FOUR, Suits.HEART));
        cards.add(new Card(Faces.EIGHT, Suits.CLUB));
        Hand hand = new Hand(cards);
        assertTrue(CheckHand.isFourOfAKind(hand));

        cards = new ArrayList<>();
        cards.add(new Card(Faces.TWO, Suits.CLUB));
        cards.add(new Card(Faces.FOUR, Suits.DIAMOND));
        cards.add(new Card(Faces.FOUR, Suits.SPADE));
        cards.add(new Card(Faces.FOUR, Suits.HEART));
        cards.add(new Card(Faces.EIGHT, Suits.CLUB));
        Hand thehand = new Hand(cards);
        assertTrue(CheckHand.isFourOfAKind(thehand));
    }

    @Test
    public void testIsThreeOfAKind() {
        Deck deck = new Deck();
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(Faces.TWO, Suits.CLUB));
        cards.add(new Card(Faces.FOUR, Suits.DIAMOND));
        cards.add(new Card(Faces.FOUR, Suits.SPADE));
        cards.add(new Card(Faces.FOUR, Suits.HEART));
        cards.add(new Card(Faces.EIGHT, Suits.CLUB));
        Hand hand = new Hand(cards);
        assertTrue(CheckHand.isThreeOfAKind(hand));

        cards = new ArrayList<>();
        cards.add(new Card(Faces.TWO, Suits.CLUB));
        cards.add(new Card(Faces.FOUR, Suits.DIAMOND));
        cards.add(new Card(Faces.FOUR, Suits.SPADE));
        cards.add(new Card(Faces.SIX, Suits.HEART));
        cards.add(new Card(Faces.EIGHT, Suits.CLUB));
        Hand thehand = new Hand(cards);
        assertTrue(CheckHand.isThreeOfAKind(thehand));
    }
}
