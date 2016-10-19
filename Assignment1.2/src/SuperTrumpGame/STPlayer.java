package SuperTrumpGame;

import java.util.ArrayList;

/**
 * Created by T'uKeyan on 7/10/2016.
 */
public class STPlayer {
    private ArrayList<Integer> playerDeck;
    private int playerId;

    public STPlayer(int playerId) {
        this.playerId = playerId;
    }

    public void setCards(ArrayList<Integer> playerDeck) {
        this.playerDeck = playerDeck;
    }

    public ArrayList<Integer> getCards() {
        return playerDeck;
    }

    public int getPlayerId() {
        return playerId;

    }
}
