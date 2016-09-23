// DebugSix4.java
// Displays 5 random numbers between 
// (and including) user-specified values
package com.company;
import java.util.Scanner;
import java.util.Random;
public class DebugSix4
{
   public static void main(String[] args)
   {
      int high, low, count;
       int a = 0;
      final int NUM = 5;
      Scanner input = new Scanner(System.in);
       Random randGen = new Random();

       System.out.println("This program displays " + NUM + " different numbers.");

       System.out.print("Please enter a low number: ");
       low = input.nextInt();

       System.out.print("Please enter a high number: ");
       high = input.nextInt();

       while (true) {
           if (low > high) {
               System.out.printf("Your high number is too low, please enter a number high than %s:", high);
               high = input.nextInt();
           } else {
               for (a = a; a < NUM; a++) {
                   count = randGen.nextInt(high - low + 1) + low;
                   System.out.print(count + " ");
               }
           }
           System.out.println("<-- These are your numbers");
           break;
       }


   }
}
