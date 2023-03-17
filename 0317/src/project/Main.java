package project;

public class Main {
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();//建立牌組功能物件,先執行建構子也就是已經先洗完牌了
        Card[] deck = myDeckOfCards.getDeck();
        int numPlayers = 4; // 設定玩家人數
        int numCardsPerPlayer = 3; // 設定每位玩家的手牌數量
        Card[][] players = new Card[numPlayers][numCardsPerPlayer];

        for (int i = 0; i < numPlayers; i++) {
            System.out.printf("Player no.%d hand:\n", i + 1);
            for (int j = 0; j < numCardsPerPlayer; j++) {//要發給玩家的數量
                players[i][j] = myDeckOfCards.dealCard();//發牌
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }
}