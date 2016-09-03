package com.company;

import javax.swing.*;

/**
 * Created by T'uKeyan on 22/08/2016.
 */
public class CondoSales {
    public static void main(String[] args) {

        String userInput;
        int userChoice;
        double housePrice;

        userInput = JOptionPane.showInputDialog(null, "What house view would you like \n 1 - Park view \n 2 - Golf course view \n 3 - Lake view");
        userChoice = Integer.parseInt(userInput);

        switch(userChoice){
            case 1:
                housePrice = 150000;
                JOptionPane.showMessageDialog(null, "You chose the park view condo. At the value of $" + housePrice + ".");
                break;
            case 2:
                housePrice = 170000;
                JOptionPane.showMessageDialog(null, "You chose the golf course view condo. At the value of $" + housePrice + ".");
                break;
            case 3:
                housePrice = 210000;
                JOptionPane.showMessageDialog(null, "You chose the lake view condo. At the value of $" + housePrice + ".");
                break;
            default:
                housePrice = 0;
                JOptionPane.showMessageDialog(null, "You made a mistake, so we cannot process your order.");

        }
    }
}
