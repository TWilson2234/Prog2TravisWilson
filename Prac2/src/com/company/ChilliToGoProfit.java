package com.company;

import java.util.Scanner;

/**
 * Created by T'uKeyan on 15/08/2016.
 */
public class ChilliToGoProfit {
    public static void main(String[] args) {

        double dinnerAdultPrice = 7;
        double dinnerChildPrice = 4;
        double dinnerAdultCost = 4.35;
        double dinnerChildCost = 3.10;
        int dinnerChildQuant;
        int dinnerAdultQuant;
        double dinnerTotal;
        double dinnerTotalProfit;
        double dinnerTotalLoss;

        Scanner scan = new Scanner(System.in);

        System.out.printf("How many adults will be attending?: ");
        dinnerAdultQuant = scan.nextInt();
        System.out.printf("How many children will be attending?: ");
        dinnerChildQuant = scan.nextInt();

        dinnerTotal = (dinnerAdultPrice * dinnerAdultQuant) + (dinnerChildPrice * dinnerChildQuant);
        dinnerTotalProfit = dinnerTotal - ((dinnerAdultCost * dinnerAdultQuant) + (dinnerChildCost * dinnerChildQuant));
        dinnerTotalLoss = (dinnerTotal - dinnerTotalProfit);

        System.out.printf("Total money raised tonight $%.2f, total profit raised $%.2f.\nWith a total loss of $%.2f", dinnerTotal, dinnerTotalProfit, dinnerTotalLoss);


    }
}
