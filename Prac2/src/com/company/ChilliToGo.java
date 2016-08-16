package com.company;

import java.util.Scanner;

/**
 * Created by T'uKeyan on 15/08/2016.
 */
public class ChilliToGo {
    public static void main(String[] args) {

        float dinnerAdultPrice = 7;
        float dinnerChildPrice = 4;
        int dinnerChildQuant;
        int dinnerAdultQuant;
        float dinnerTotal;

        Scanner scan = new Scanner(System.in);

        System.out.printf("How many adults will be attending?: ");
        dinnerAdultQuant = scan.nextInt();
        System.out.printf("How many children will be attending?: ");
        dinnerChildQuant = scan.nextInt();

        dinnerTotal = (dinnerAdultPrice * dinnerAdultQuant) + (dinnerChildPrice * dinnerChildQuant);

        System.out.printf("Total profit raised tonight $%.2f", dinnerTotal);

    }
}
