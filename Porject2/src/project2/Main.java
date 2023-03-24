package project2;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    private static String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private static String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

    public static void main(String[] args) {
        String[] DeckOfcardFace = new String[52];
        String[] DeckOfcardSuit = new String[52];
        for (int i = 0; i < 52; i++) {
            DeckOfcardFace[i] = faces[i % 13];
            DeckOfcardSuit[i] = suits[i / 13];
        }

        SecureRandom random = new SecureRandom();
        for (int i = 0; i < DeckOfcardFace.length; i++) {
            int randNum = random.nextInt(52);
            String tempFace = DeckOfcardFace[randNum];
            String tempSuit = DeckOfcardSuit[randNum];

            DeckOfcardFace[randNum] = DeckOfcardFace[i];
            DeckOfcardSuit[randNum] = DeckOfcardSuit[i];

            DeckOfcardFace[i] = tempFace;
            DeckOfcardSuit[i] = tempSuit;
        }
        
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int t = 0; t < 3; t++) {
        	System.out.println("Please enter the number of dealcards!");
        	int num = scanner.nextInt();
        	   //deal Cards
        	   int numOfCards = num;
        	   for(int i = 0; i < numOfCards; i++) {
        		   String face = DeckOfcardFace[count];
        		   String suit = DeckOfcardSuit[count];
        		   count ++;
        		   System.out.println(face + '_' + suit);
        	   }
        	   System.out.println("=====================");
        }
        for(int i = 52; i >= (52-count); i--) {
      		   String face = DeckOfcardFace[count];
      		   String suit = DeckOfcardSuit[count];
      		   System.out.println(face + '_' + suit);
      	   }
        }       
}
