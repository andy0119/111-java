package project2;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] deckOfCardFace = new String[52];
        String[] deckOfCardSuit = new String[52];

        // initial the deckOfCard
        for (int i = 0; i < deckOfCardFace.length; i++) {
            deckOfCardFace[i] = faces[i % 13];
            deckOfCardSuit[i] = suits[i / 13];
        }

        // shuffle
        SecureRandom randomNum = new SecureRandom();
        for (int i = 0; i < deckOfCardFace.length; i++) {
            int randNum = randomNum.nextInt(52);
            String tempFace = deckOfCardFace[randNum];
            String tempSuit = deckOfCardSuit[randNum];

            deckOfCardFace[randNum] = deckOfCardFace[i];
            deckOfCardSuit[randNum] = deckOfCardSuit[i];

            deckOfCardFace[i] = tempFace;
            deckOfCardSuit[i] = tempSuit;
        }

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int t = 0; t < 4; t++) {
            System.out.println("Please enter the number of cards: ");
            int num = scanner.nextInt();
            
            // deal cards
            int numOfCards = num;
            for (int i = 0; i < numOfCards; i++) {
                String face = deckOfCardFace[count];
                String suit = deckOfCardSuit[count];
                count++;
                System.out.println(face + '_' + suit);
            }
            System.out.println("=======================");
        }
    }
}
