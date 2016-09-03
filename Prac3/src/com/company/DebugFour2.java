package com.company;// Some circle statistics

public class DebugFour2 {
    public static void main(String args[]) {
        double radius = 12.6;
        double area = java.lang.Math.PI * radius * radius;
        double diameter = radius;
        diameter = (2 * diameter);

        System.out.println("Circle statistics");
        System.out.println("area is " + area);

        System.out.println("diameter is " + diameter);
    }
}
