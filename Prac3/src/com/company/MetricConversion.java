package com.company;

/**
 * Created by T'uKeyan on 22/08/2016.
 */

import java.util.Scanner;

public class MetricConversion {
    public static void main(String[] args) {

        double measureInput;
        Scanner input = new Scanner(System.in);

        System.out.printf("Please enter a measurement: ");
        measureInput = input.nextDouble();

        calcToCenti(measureInput);
        calcToLitre(measureInput);

    }

    public static void calcToCenti(double inch) {

        final double CENTIMETRE = 2.54;
        inch = inch * CENTIMETRE;
        System.out.println("Inches to " + inch + " centimetres.");

    }

    public static void calcToLitre(double gallon) {

        final double LITRE = 3.7854;
        gallon = gallon * LITRE;
        System.out.printf("Gallons rounded to %.2f litres", gallon);


    }
}
