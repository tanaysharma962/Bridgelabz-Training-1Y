package strings;

import java.util.Scanner;

public class DeckOfCards {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }

        for (int i = 0; i < numOfCards; i++) {

            int randomCardNumber = i + (int)(Math.random() * (numOfCards - i));

            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        if (numOfCards % players != 0) {
            System.out.println("Cards cannot be evenly distributed among players.");
        } else {

            int cardsPerPlayer = numOfCards / players;

            String[][] playerCards = new String[players][cardsPerPlayer];

            index = 0;

            for (int i = 0; i < players; i++) {
                for (int j = 0; j < cardsPerPlayer; j++) {
                    playerCards[i][j] = deck[index];
                    index++;
                }
            }

            for (int i = 0; i < players; i++) {

                System.out.println("\nPlayer " + (i + 1) + " cards:");

                for (int j = 0; j < cardsPerPlayer; j++) {
                    System.out.println(playerCards[i][j]);
                }
            }
        }

        sc.close();
    }
}

