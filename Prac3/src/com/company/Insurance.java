package com.company;

/**
 * Created by T'uKeyan on 22/08/2016.
 */

import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {

        int currentYear;
        int birthYear;
        double premium;

        Scanner input = new Scanner(System.in);

        System.out.printf("What is the current year: ");
        currentYear = input.nextInt();
        System.out.printf("What is your data of birth?: ");
        birthYear = input.nextInt();

        premium = premiumCalc(currentYear, birthYear);

        System.out.printf("Your insurance will cost $%.2f", premium);

    }

    public static int premiumCalc(int curYear, int birYear) {
        int decade;
        int modDecade;
        int calculation;

        decade = curYear - birYear;
        modDecade = decade % 10;
        decade = decade - modDecade;
        decade = decade / 10;
        calculation = ((decade + 15) * 20);

        return calculation;

    }
}
