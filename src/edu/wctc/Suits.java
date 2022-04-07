package edu.wctc;

public enum Suits {
    SPADE("of spades"),
    DIAMOND("of diamond"),
    CLUB("of clubss"),
    HEART("of hearts");

    private String value;
    Suits(String spade) {
    }

    public String getValue() {
        return value;
    }
}
