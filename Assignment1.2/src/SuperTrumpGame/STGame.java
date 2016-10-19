package SuperTrumpGame;
import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by T'uKeyan on 7/10/2016.
 */
public class STGame {
    private static final int NUM_CARDS_TO_DEAL = 8;
    private int numPlayers;
    private int dealerId;
    private STPlayer[] players;
    public STDeck deck;
    public ArrayList<Integer> playerDeck;

    int yourPlayerId;

    public STGame(int numPlayers){

        this.numPlayers = numPlayers;
        deck = new STDeck();
    }

    public void selectDealer() {
        int i = new Random().nextInt(2);
        dealerId = 1;

    }

    public void dealRandomCardsToEachPlayer() {
        players = new STPlayer[numPlayers];
        int b = 0;

        for(int i = 0; i < numPlayers; i++) {
            players[i] = new STPlayer(i + 1);
        }

        for(STPlayer player : players) {
            b = b +1;
            System.out.println("Deck " + b);
            playerDeck = STDeck.dealCards(NUM_CARDS_TO_DEAL);


        }
    }

    public void selectYouAsPlayer() {
        yourPlayerId = 0;
    }

    public STPlayer getHumPlayer() {
        return players[yourPlayerId];
    }

    public void playTheGame() {
        boolean gameIsOn = true;
        while (gameIsOn) {

            for (int i = 0; i < players.length; i++){
                if (i == 0) {
                    getHumanTurn();


                } else {
                    getBotTurn();
                }

            }
            //showTurnPlayer()
        }
    }

    private void getBotTurn() {
        System.out.println("Bot Turn");
    }

    private void getHumanTurn() {
        System.out.println("Player Turn");
        Scanner userChoice = new Scanner(System.in);
        System.out.println("Please Enter a card Id: ");
        String userInput = userChoice.nextLine();
        int userCard = Integer.parseInt(userInput);

//        for (int i = 0; i < STDeck.playerDeck.size(); i++) {
//            if (STDeck.playerDeck.get(i).getId() == userCard) {
//                System.out.println("This card");
//                getPlayerCard(i);
//                STDeck.playerDeck.remove(i);
//            } else {
//                System.out.println("Not this card");
//            }
//        }
    }

    public int getPlayerCard(int i) {
        //return STDeck.playerDeck.get(i);
        return i;
    }
}
