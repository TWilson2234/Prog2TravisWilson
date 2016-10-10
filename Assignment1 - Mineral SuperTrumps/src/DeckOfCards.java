
/**
 * Created by T'uKeyan on 23/09/2016.
 */

import java.io.*;
import java.nio.file.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCards {
    public static void deckMain() {
        int idCount = 0;
        int cardCount = 54;
        getAndCreate(cardCount);
        cardCount = 8;
    }

    public static void getAndCreate(int cardCount) {
        int quantPlayers = 4;
        int deckCardCount = 8;
        int idCount = -1;
        cardCount = 53;


        //Import details
        Path file = Paths.get("C:\\Users\\T'uKeyan\\Desktop\\Uni subjects\\Programming2\\Prog2TravisWilson\\Assignment1 - Mineral SuperTrumps\\src\\CardsFile.csv");
        InputStream input = null;
        String line = " ";

        //Lists
        List cardDetail = new ArrayList();
        List<Card> cardDeck = new ArrayList<Card>();
        List<Card> playerDeck = new ArrayList<Card>();
        String splitBy = ",";

        try {
            input = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            //Assigning objects to array
            for (int n = 0; n < cardCount; n++) {
                while ((line = reader.readLine()) != null) {
                    String[] details = line.split(splitBy);
                    idCount = idCount + 1;
                    Card card = new Card(idCount, details[0], details[1], details[2], details[3], details[4], details[5]);
                    cardDeck.add(card);
                    //System.out.println(cardDeck.get(idCount).getId()+" "+ cardDeck.get(idCount).getName());
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("Cards Loaded Successfully!");
        Random randomiser = new Random();
        int randomNum = 0;
        randomNum = randomiser.nextInt((53 - 1) + 1) + 1;


    }
}