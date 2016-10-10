package SuperTrumpGame;

/**
 * Created by T'uKeyan on 7/10/2016.
 */
public class MineralST {
    private static final int NEW_GAME = 1;

    public static void main(String[] args) {
        showWelcome();
        showMenu();
        int opt = getUserMenuChoice();
        STGame game;
        if(opt == NEW_GAME) {
            game = startNewGame();
            game.playTheGame();
        }
        
    }

    private static STGame startNewGame() {
        int numPlayers = getNumPlayers();
        STGame game = new STGame(numPlayers);
        game.selectDealer();
        game.dealRandomCardsToEachPlayer();
        game.selectYouAsPlayer();
        STPlayer humPlayer = game.getHumPlayer();
        showPlayer(humPlayer);
        //dealCards();
        return game;
    }

    private static void showPlayer(STPlayer humPlayer) {
        System.out.println("Human player Id= " + humPlayer);
    }

    private static int getNumPlayers() {
        return 3;
    }

    private static int getUserMenuChoice() {
        return 1;
    }

    private static void showMenu() {
        System.out.println("1. Start \n2. Quit");
    }

    private static void showWelcome() {
        System.out.println("Hello");
    }
}
