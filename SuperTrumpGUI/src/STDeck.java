import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by T'uKeyan on 21/10/2016.
 */
public class STDeck {
    public static ArrayList<Integer> playerDeck = new ArrayList<Integer>();
    public static ArrayList<Integer> refDeck = new ArrayList<Integer>();
    public static ArrayList<STCard> gameDeck = new ArrayList<STCard>();
    final static int NUM_CARDS_DECK = 60;
    final static int NUM_PLAYER_HAND = 8;

    public static ArrayList<STCard> createDeck() {

        //Importing the CSV
        Path file = Paths.get("C:\\Users\\T'uKeyan\\Desktop\\Uni subjects\\Programming2\\Prog2TravisWilson\\SuperTrumpGUI\\src\\CardsFile.csv");
        InputStream input = null;
        String line = " ";
        String splitBy = ",";
        int i = 0;

        try {
            input = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            //Creating Card Objects
            for (i = 0; i < NUM_CARDS_DECK; i++) {
                while ((line = reader.readLine()) != null) {
                    i = i + 1;
                    String[] details = line.split(splitBy); //Creating the details array
                    gameDeck.add(new STCard(i, details[0], details[1], details[2], details[3], details[4], details[5]));
                    refDeck.add(i); //Adding in integer as the reference
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return gameDeck;
    }

        public static ArrayList<Integer> getDeck() {
            for (int i = 0; i < NUM_PLAYER_HAND; i++) {
                int idx = new Random().nextInt(refDeck.size());
                if (playerDeck.contains(idx)) {
                    i = i -1;
                } else {
                    playerDeck.add(idx);
                    System.out.printf("%s added to deck \n", idx);
                }

            }

            return playerDeck;

        }

        public STCard getCardFromDeck(int cardChoice) {
            System.out.printf("The card is %s", gameDeck.get(cardChoice).getName());
            return gameDeck.get(cardChoice);

        }
    }

