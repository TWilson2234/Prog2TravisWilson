package com.company;
// This class calculates a waitperson's tip as 15% of the bill

public class DebugThree1 {
    public static void main(String[] args) {

        double myCheck = 50.00;
        double yourCheck = 19.95;

        System.out.println("Tips are");
        calcTip(myCheck);
        calcTip(yourCheck);
    }

    public static double calcTip(double bill) {
        double tip;
        final double RATE = 0.15;
        tip = bill + RATE;
        System.out.printf("The tip should be at least $%.2f \n", tip );
        return tip;
    }
}
