import java.security.SecureRandom;

public class DeckOfCard {
    String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
    String[] suits = { "♣", "♦", "♥", "♠" };
    Card[] deckOfCard = new Card[52];
    int count;

    // initial the deckOfCard
    public DeckOfCard() {
        for (int i = 0; i < deckOfCard.length; i++) {
            deckOfCard[i] = new Card();
            deckOfCard[i].face = faces[i % 13];
            deckOfCard[i].suit = suits[i / 13];
        }
    }

    public void shuffle(boolean isUsed) {
        SecureRandom randomNum = new SecureRandom();

        int i;
        int randNum;
        int times;
        if (!isUsed) {
            i = count;
            randNum = randomNum.nextInt(52 - count) + count;
            times = deckOfCard.length;
        } else {
            i = 0;
            randNum = randomNum.nextInt(count);
            times = count;
        }
        
        for (; i < times; i++) {
            Card tempFace = deckOfCard[randNum];

            deckOfCard[randNum] = deckOfCard[i];

            deckOfCard[i] = tempFace;
        }
    }

    public void dealCard(int numOfCards, boolean isUsed) {
        int localCount = count;
        
        if (isUsed)
            localCount = 0;
        
        for (int i = 0; i < numOfCards; i++) {
            Card card = deckOfCard[localCount];
            localCount++;
            System.out.println(card.face + '_' + card.suit);
        }
        
        if (!isUsed)
            count = localCount;
    }
}
