package com.company;

/**
 * Created by T'uKeyan on 19/08/2016.
 */
public class NumbersDemo {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 49;

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
