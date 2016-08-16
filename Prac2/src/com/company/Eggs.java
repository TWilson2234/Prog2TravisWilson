package com.company;
import java.util.Scanner;


public class Eggs {

    public static void main(String[] args) {
	    double dozenEggsPrice = 3.25;
        int dozCount = 0;
        double singleEgg = 0.45;
        double eggTotalPrice = 0;
        int eggQuant = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("How many eggs would you like?: ");
        eggQuant = scan.nextInt();

        dozCount = (eggQuant / 12);
        eggQuant = (eggQuant % 12);

        eggTotalPrice = (dozenEggsPrice * dozCount) + (singleEgg * eggQuant);

        System.out.printf("You have " + dozCount + " dozen eggs and " + eggQuant + " loose eggs, coming to a total of " + "$%.2f", eggTotalPrice);



    }
}
