package com.company;

/**
 * Created by T'uKeyan on 29/08/2016.
 */
public class Factorials {
    public static void main(String[] args) {
        int baseLow = 1;
        int baseHigh = 11;
        int count = 10;
        int output;

        for (baseLow = 1; baseLow < 11; baseLow++) {
            //System.out.println(" ");
            System.out.printf("\n%s Factorial \n", baseLow);
            //System.out.println(" ");
            for (count = 10; count > 0; count--){
                output = (baseLow * count);
                System.out.println(output);

            }
        }
    }
}
