package com.company;

/**
 * Created by T'uKeyan on 22/08/2016.
 */

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;

        System.out.printf("Please enter a number: ");
        userInput = input.nextInt();

        if ((userInput % 2) == 0) {
            System.out.printf("%s is even!", userInput);
        } else {
            System.out.printf("%s is odd!", userInput);
        }
    }
}
