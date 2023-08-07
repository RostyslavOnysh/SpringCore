package org.example.model;

public class Card {
    private String cardName;
    private CardType cardType;

    public Card(String cardName, CardType cardType) {
        this.cardName = cardName;
        this.cardType = cardType;
    }

    public void setCard() {
    }

    public enum CardType {
        USUAL, GOLD
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public CardType getCardType() {
        return cardType;
    }


    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }


}
