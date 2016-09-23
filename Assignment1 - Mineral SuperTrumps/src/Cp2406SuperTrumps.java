import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by T'uKeyan on 2/09/2016.
 */

public class Cp2406SuperTrumps {
    public static void main(String[] args) {

        showWelcome();
        showMenu();
        int opt = getUserMenuChoice();
        if (opt == NEW_GAME) {
            startNewGame();
        }
    }

    private static void startNewGame() {
        int numPlayers = getNumPlayers();
        STGame game = new STGame(numPlayers);
        game.selectDealer
    }
}
