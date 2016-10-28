import java.util.ArrayList;

/**
 * Created by T'uKeyan on 7/10/2016.
 */
public class STPlayer {
    public static ArrayList<Integer> playerDeck;
    private static int playerId;

    public STPlayer(int playerId, ArrayList<Integer> playerDeck) {
        this.playerId = playerId;
        this.playerDeck = playerDeck;
    }

    public void setCards(ArrayList<Integer> playerDeck) {
        this.playerDeck = playerDeck;
    }

    public static ArrayList<Integer> getCards() {
        return playerDeck;
    }

    public static int getPlayerId() {
        return playerId;

    }
}
