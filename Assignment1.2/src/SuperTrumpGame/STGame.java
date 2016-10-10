package SuperTrumpGame;
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
    private STDeck deck;
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

        for(int i = 0; i < numPlayers; i++) {
            players[i] = new STPlayer(i + 1);
        }

        for(STPlayer player : players) {
            ArrayList<STCard> cards = deck.dealCards(NUM_CARDS_TO_DEAL);
            player.setCards(cards);
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



    }
}
