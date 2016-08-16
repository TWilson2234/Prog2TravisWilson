package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by jc320109 on 8/08/16.
 */
public class MinuteConversion {
    public static void main(String[] args) {

        int minCount;
        double hoursSplit;
        double daysCount;

        Scanner scan = new Scanner(System.in);

        System.out.printf("Please enter minutes you will convert: ");
        minCount  = scan.nextInt();

        hoursSplit = (minCount / 60);
        daysCount =  (hoursSplit / 24);

        System.out.printf("%s minutes is %.0f hours and %.3f days.", minCount, hoursSplit, daysCount);

    }
}
