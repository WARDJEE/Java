package week07.Kaartspelletjes;

import java.util.Random;

public class Card {
    private String suit;
    private String value;

    public Card(String suit, String value){
        this.suit = suit;
        this.value = value;
    }

    public String getSuit(){
        return this.suit;
    }

    public String getValue(){
        return this.value;
    }

    public String toString(){
        return this.suit + " " + this.value;
    }

    public static Card[] createCards(int aantal, String[] suits, String[] values){
        Random random = new Random();
        Card[] kaarten = new Card[aantal];
        for (int i = 0; i < aantal; i++) {
            String suit = suits[random.nextInt(suits.length)];
            String value = values[random.nextInt(values.length)];
            kaarten[i] = new Card(suit, value);
        }
        return kaarten;
    }

    public static void showCards(Card[] kaarten){
        for (Card kaart : kaarten)
            System.out.println(kaart);
    }
}
