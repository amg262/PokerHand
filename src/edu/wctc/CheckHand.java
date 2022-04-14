package edu.wctc;

import java.util.List;

public class CheckHand {

    public static boolean isRoyalFlush(Hand hand) {

        List<Card> cards = hand.getHand();


        if (cards.get(0).getFace() == Faces.TEN &&
                cards.get(1).getFace() == Faces.JACK &&
                cards.get(2).getFace() == Faces.QUEEN &&
                cards.get(3).getFace() == Faces.KING &&
                cards.get(4).getFace() == Faces.ACE &&

                cards.get(0).getSuit() == cards.get(1).getSuit() &&
                cards.get(0).getSuit() == cards.get(2).getSuit() &&
                cards.get(0).getSuit() == cards.get(3).getSuit() &&
                cards.get(0).getSuit() == cards.get(4).getSuit()


        )
            return true;
        else
            return false;


    }

    public static boolean isFlush(Hand hand) {
        List<Card> cards = hand.getHand();


        if (
                cards.get(0).getSuit() == cards.get(1).getSuit() &&
                        cards.get(0).getSuit() == cards.get(2).getSuit() &&
                        cards.get(0).getSuit() == cards.get(3).getSuit() &&
                        cards.get(0).getSuit() == cards.get(4).getSuit()


        )
            return true;
        else
            return false;
    }

    public static boolean isFourOfAKind(Hand hand) {
        List<Card> cards = hand.getHand();


        if (
                cards.get(0).getFace() == cards.get(3).getFace() &&
                        cards.get(1).getFace() == cards.get(4).getFace()

        )
            return true;
        else
            return false;
    }

    public static boolean isThreeOfAKind(Hand hand) {
        List<Card> cards = hand.getHand();


        if (
                cards.get(0).getFace() == cards.get(2).getFace() &&
                        cards.get(1).getFace() == cards.get(3).getFace() &&
                        cards.get(2).getFace() == cards.get(4).getFace()

        )
            return true;
        else
            return false;
    }
}
