package com.company;

import java.util.Scanner;

/**
 * Created by T'uKeyan on 29/08/2016.
 */

public class EvenEntryLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = 1;
        System.out.printf("Please enter a even number or 999: ");
        num = input.nextInt();

        while (true) {
            if (num == 999) {
                System.out.println("You broke it!..");
                break;
            }
            else if (num % 2 == 0) {
                System.out.println("Even number, Good Job");
                break;
            } else {
                System.out.println("You entered an odd number! Enter another number!");
                System.out.printf("Please enter a even number or 999: ");
                num = input.nextInt();
            }

        }
    }
}
