package SuperTrumpGame;

import java.util.ArrayList;

/**
 * Created by T'uKeyan on 7/10/2016.
 */
public class STPlayer {
    private ArrayList<STCard> cards;
    private int playerId;

    public STPlayer(int playerId) {
        this.playerId = playerId;
    }

    public void setCards(ArrayList<STCard> cards) {
        this.cards = cards;
    }

    public ArrayList<STCard> getCards() {
        return cards;
    }

    public int getPlayerId() {
        return playerId;

    }
}
