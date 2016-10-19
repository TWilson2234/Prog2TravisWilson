package UserInterfaces;
import javax.swing.*;
import java.awt.*;

/**
 * Created by T'uKeyan on 14/10/2016.
 */
public class JFrame4 {
    public static void main(String[] args) {
        final int FRAME_WIDTH = 250;
        final int FRAME_HEIGHT = 100;

        Font headlineFont = new Font("Papyrus", Font.BOLD, 36);
        JFrame.setDefaultLookAndFeelDecorated(false);
        JFrame aFrame = new JFrame("Fourth Frame");
        aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        aFrame.setVisible(true);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel greeting = new JLabel("Good Day.");
        greeting.setFont(headlineFont);
        aFrame.add(greeting);

    }
}
