/**
 * Created by T'uKeyan on 2/09/2016.
 */
public class STGame {
    private final NUM_CARDS_TO_DEAL = 8;
    private int numPlayers;
    private int dealerID;
    private STPlayer[] players;
    private STDeck deck;


    public STGame(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public void selectDealer() {
        dealerID = 1;
    }

    public void dealRandomCardsToEachPlayer() {
        players = new STPlayer[numPlayers];

        for (STPplayer player : players) {
            STCard card = deck.dealCards(NUM_CARDS_TO_DEAL);
            player.setCards();
        }
    }
}
