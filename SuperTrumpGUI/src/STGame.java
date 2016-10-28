/**
 * Created by T'uKeyan on 24/10/2016.
 */

import javax.swing.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class STGame {
    private int numPlayers;
    private ArrayList<STCard> gameDeck = STDeck.gameDeck;

    public STGame (int numPlayers) {
        ArrayList<STPlayer> playerList = new ArrayList<STPlayer>();
        ArrayList<Integer> playerDeck = new ArrayList<Integer>();
        JOptionPane.showMessageDialog(null, "You are the first player");
        while (true) {
            for (int x = 0; x < numPlayers; x++) {
                playerList.add(new STPlayer(x, STDeck.getDeck()));
                System.out.printf("Player %s \n", x);
                if (STPlayer.getPlayerId() == 0 && x == 0) {
                    makePlayerChoice();
                } else {
                    makeBotChoice();
                    }
                x += 1;
                }

//            for (int x = 0; x < numPlayers; x++) {
//                if (STPlayer.getPlayerId() == 0 && x == 0) {
//                    makePlayerChoice();
//                } else {
//                    makeBotChoice();
//
//                    }

            }
        }


    public int makePlayerChoice() {
        String playerCard;
        ArrayList<Integer> playerDeck = STPlayer.getCards();
        System.out.println(playerDeck.size());

        String cardChoice;
        cardChoice = "Your cards are: \n";

        for (int x = 0; x < playerDeck.size(); x++) {
            cardChoice = cardChoice +" " + playerDeck.get(x)+ " " + gameDeck.get(playerDeck.get(x)).getName() + "\n";
        }

        cardChoice = cardChoice + "Please enter a card number: ";
        playerCard = JOptionPane.showInputDialog(null, cardChoice);
        int card = Integer.parseInt(playerCard);

        while(true) {
            if (playerDeck.contains(card)) {
                for (int i = 0; i < playerDeck.size(); i++) {
                    if (playerDeck.get(i) == gameDeck.get(card - 1).getId()) {
                        JOptionPane.showMessageDialog(null, "You play " + gameDeck.get(card).getName());
                        playerDeck.remove(i);
                        JOptionPane.showMessageDialog(null, playerDeck);
                        return Integer.parseInt(playerCard);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "That card isn't in your hand.");
                playerCard = JOptionPane.showInputDialog(null, cardChoice);
                card = Integer.parseInt(playerCard);
            }
        }
    }

    public int makeBotChoice() {
        int botChoice = 0;

        JOptionPane.showMessageDialog(null, "Bot turn");
        JOptionPane.showMessageDialog(null, "Bot finish");

        return botChoice;

    }
}
