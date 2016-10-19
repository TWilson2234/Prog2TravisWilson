package CardTesting;

import java.util.ArrayList;

/**
 * Created by T'uKeyan on 14/10/2016.
 */
public class cardMain {

    private static ArrayList<Card> playerCards;
    private static ArrayList<Card> tempCard;

    public static void main(String[] args) {
        playerCards.add(new Card("Card1", 20));
        playerCards.add(new Card("Card2", 50));
        tempCard.add(new Card("", 0));

        System.out.println(tempCard.get(0).getName());

        //tempCard.set(0, playerCards.get(0));

        System.out.println(tempCard.get(0).getName());

    }


}
