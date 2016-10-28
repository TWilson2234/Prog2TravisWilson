import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import static javafx.application.Platform.exit;

/**
 * Created by T'uKeyan on 21/10/2016.
 */
public class STMain{
    private static ArrayList<STCard> gameDeck;
    private static int numPlayers = 4;
    public static void main(String[] args) {
        gameDeck = STDeck.createDeck();

        int opt = showGameMenu();

        if (opt == 1) {
            gameStart();
        } else {
            System.out.println("You quit.");
            System.exit(0);
        }

    }

    public static int showGameMenu() {
        String menu = "Please make a menu choice: \n" + "1. Start Game\n" + "2. Quit";
        String opt = JOptionPane.showInputDialog(menu);
        return Integer.parseInt(opt);
    }

    public static void gameStart() {
        System.out.println("Game runs");
        STGame game = new STGame(numPlayers);

    }
}
