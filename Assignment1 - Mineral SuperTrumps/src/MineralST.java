/**
 * Created by T'uKeyan on 2/09/2016.
 */

public class MineralST {
    public static void main(String[] args) {

        welcomeMessage();
        int menuOpt = showUserMenu();
            switch(menuOpt) {
                case 1:
                    System.out.println("Let's play");
                    break;
                case 2:
                    System.out.println("Closing program");
                    break;
            }
    }

    private static

    private static void welcomeMessage() {
        System.out.println("Welcome to Mineral Super Trumps");
    }

    private static int showUserMenu() {
        System.out.println("1. Play Game" + '\n' + "2. Quit");
        return 1;
    }

    private static int numPlayers() {
        return 2;
    }

}
