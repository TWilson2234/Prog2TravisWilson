package SuperTrumpGame;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by T'uKeyan on 7/10/2016.
 */
public class STDeck {
    private static final int NUM_CARDS_INIT = 60;
    private ArrayList<STCard> cards;

    public STDeck() {
        cards = new ArrayList<STCard>();

        Path file = Paths.get("C:\\Users\\T'uKeyan\\Desktop\\Uni subjects\\Programming2\\Prog2TravisWilson\\Assignment1 - Mineral SuperTrumps\\src\\CardsFile.csv");
        InputStream input = null;
        String line = " ";
        String splitBy = ",";
        List cardDetail = new ArrayList();
        int i = 0;

        try {
            input = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));


            for (i = 0; i < NUM_CARDS_INIT; i++) {
                while ((line = reader.readLine()) != null) {
                    i = i + 1;
                    String[] details = line.split(splitBy);
                    cards.add(new STCard(i, details[0], details[1], details[2], details[3], details[4], details[5]));
                    System.out.println(cards.get(i - 1).getId());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public ArrayList<STCard> dealCards(int xCards) {
            ArrayList<STCard> ret = new ArrayList<STCard>();

            for (int i = 0; i < xCards; i++){
                int idx = new Random().nextInt(cards.size());
                STCard card = cards.remove(idx);
                ret.add(card);
        }

        return ret;
    }
}
