package com.company;
// Application looks up home price
// for different floor plans
// allows upper or lowercase data entry

import javax.swing.*;

public class DebugEight3
{
    public static void main(String[] args)
    {
        String entry; //String build
        char[] floorPlans = {'A','B','C'}; //Array of floor plans
        int[] pricesInThousands = {145, 190, 235}; //Prices of Buildings
        char plan; //Floor plan
        int x;
        int fp = 0;

        String prompt = "Please select a floor plan\n" +
        "Our floorPlanss are:\n" + "A - Augusta, a ranch\n" +
        "B - Brittany, a split level\n" +
        "C - Colonial, a two-story\n" +
        "Enter floorPlans letter";

        //Code
        entry = JOptionPane.showInputDialog(null, prompt);


        for(x = 0; x < floorPlans.length; ++x)
            if(entry.charAt(0) == floorPlans[x]) {
                fp = floorPlans[x];
                System.out.println("Yes");
                System.out.println(fp);

            } else {
                System.out.println("No");
            }
    }
}