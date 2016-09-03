package com.company;

/**
 * Created by T'uKeyan on 22/08/2016.
 */
public class FormLetterWriter {
    public static void main(String[] args) {
        String LName = "Wilson";
        String FName = "Travis";

        displaySalutation1(LName);
        displaySalutation2(FName, LName);
    }

    public static void displaySalutation1(String lName) {
        System.out.println("Dear Mr or Mrs " + lName);
    }

    public static void displaySalutation2(String fName, String lName) {
        System.out.println("Dear " + fName + " " + lName);


    }




}
