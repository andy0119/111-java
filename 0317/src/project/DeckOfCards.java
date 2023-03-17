package project;

import java.security.SecureRandom;

public class DeckOfCards {
    private String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private Card[] deck;
    private int current;

    public DeckOfCards() { //建構子內含洗牌功能
        deck = new Card[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(faces[i % 13], suits[i / 13]);
        }
        shuffleDeck();//開始洗牌
        current = 0;//當前的發牌數
    }

    public Card[] getDeck() {
        return deck;
    }

    private void shuffleDeck() {
        SecureRandom random = new SecureRandom();
        for (int i = deck.length - 1; i > 0; i--) { 
            int j = random.nextInt(i + 1);//要互換的隨機亂數範圍
            Card temp = deck[i]; //互換法
            deck[i] = deck[j]; 
            deck[j] = temp;
        }
    }

    public Card dealCard() {   //發牌功能
        
    	if (current < deck.length) {//用條件式來做到牌發完的null回傳
            return deck[current++]; //回傳撲克牌，並紀錄+1
        } 
        
        else {
            return null;
        }
    }
}
