
public class Main {

    public static void main(String[] args) {
        DeckOfCard deckOfCard;
        deckOfCard = new DeckOfCard();

        // 第 1 次 洗 + 發
        deckOfCard.shuffle(false);
        deckOfCard.dealCard(3, false);
        System.out.println("=======================");

        // 第 2 次 洗 + 發
        deckOfCard.shuffle(false);
        deckOfCard.dealCard(2, false);
        System.out.println("=======================");
        
        // 第 3 次 洗 + 發
        deckOfCard.shuffle(true);
        deckOfCard.dealCard(4, true);
        System.out.println("=======================");
        
        // 第 4 次 洗 + 發
        deckOfCard.shuffle(false);
        deckOfCard.dealCard(2, false);
        System.out.println("=======================");
    }
}
