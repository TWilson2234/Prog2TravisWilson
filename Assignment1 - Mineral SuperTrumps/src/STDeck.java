import java.util.ArrayList;

/**
 * Created by T'uKeyan on 2/09/2016.
 */
public class STDeck {
    private ArrayList<STCard> cards;

    public STDeck() {
        cards = new ArrayList<STCard>(NUM_CARDS_INIT);

        for (int i = 0; i < NUM_CARDS_INIT; i++) {
            cards.add(new STCard());
        }
    }

    public ArrayList<STCard> dealCards(int i) {
        return null;
    }
}
