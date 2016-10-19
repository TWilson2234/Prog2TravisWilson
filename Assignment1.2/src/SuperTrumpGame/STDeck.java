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
    private final int NUM_CARDS_INIT = 60;
    private final int playerCards = 8;
    private ArrayList<STCard> cards;
    public ArrayList<Integer> playerDeck;
    public static ArrayList<Integer> refDeck = new ArrayList<Integer>();

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

            //Creating Card Objects
            for (i = 0; i < NUM_CARDS_INIT; i++) {
                while ((line = reader.readLine()) != null) {
                    i = i + 1;
                    String[] details = line.split(splitBy);
                    cards.add(new STCard(i, details[0], details[1], details[2], details[3], details[4], details[5]));
                    refDeck.add(i);
                    //System.out.println(refDeck.get(i - 1));
                    //System.out.printf("Id: %s,%s, %s \n", cards.get(i - 1).getId(), cards.get(i - 1).getName(), cards.get(i - 1).getValue());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        //Creating an integer list to reference the objects
        public static ArrayList<Integer> dealCards(int cardsToDeal) {
            ArrayList<Integer> playerDeck = new ArrayList<>();

            for (int i = 0; i < cardsToDeal; i++){
                int idx = new Random().nextInt(refDeck.size());
                if (playerDeck.contains(idx)){
                    i = i - 1;
                } else {
                    playerDeck.add(idx);
                }
        }
        return playerDeck;
    }
}
