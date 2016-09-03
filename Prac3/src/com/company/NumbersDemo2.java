package com.company;

import java.util.Scanner;

/**
 * Created by T'uKeyan on 19/08/2016.
 */
public class NumbersDemo2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        System.out.printf("Enter the first number: ");
        num1 = input.nextInt();
        System.out.printf("Enter your second number: ");
        num2 = input.nextInt();

        //Function call
        displayTwiceTheNum(num1, num2);
        displayNumPlusFive(num1, num2);
        displaySquareTheNum(num1, num2);

    }


    //Twice the number
    public static void displayTwiceTheNum(int a, int b) {
        a = (a * 2);
        b = (b * 2);

        System.out.println("Number 1 is " + a + " and number 2 is " + b + " doubled.");
    }

    //Plus 5
    public static void displayNumPlusFive(int a, int b) {

        a = (a + 5);
        b = (b + 5);

        System.out.println("Number 1 is " + a + " and number 2 is " + b + " plus 5.");

    }

    //Square the number
    public static void displaySquareTheNum(int a, int b) {

        a = (a * a);
        b = (b * b);

        System.out.println("Number 1 is " + a + " and number 2 is " + b + " squared.");
    }
}
