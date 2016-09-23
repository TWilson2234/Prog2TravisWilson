package com.company;// Sum and average an array of integers

public class DebugEight2 {
    public static void main(String args[]) {
        int[] someNums = {4, 17, 22, 8, 35};
        int tot = 0;
        int x;
        int someNumsLength = someNums.length;

        for (x = 0; x < someNumsLength; ++x)
            tot += someNums[x];
        System.out.println("Sum is " + tot);
        tot /= someNumsLength;
        System.out.println("Average is " + tot);
    }
}
