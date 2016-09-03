package com.company;

/**
 * Created by T'uKeyan on 22/08/2016.
 */
public class Billing {
    public static void main(String[] args) {
        double bookPrice = 2.88;
        int bookQuant = 5;
        double bookVoucher = (bookPrice * 0.8);
        double bookPriceTotal;

        bookPriceTotal = computeBill1(bookPrice);
        System.out.printf("First %.2f \n", bookPriceTotal);

        bookPriceTotal = computeBill2(bookPrice, bookQuant);
        System.out.printf("Second %.2f \n", bookPriceTotal);

        bookPriceTotal = computeBill3(bookPrice, bookQuant, bookVoucher);
        System.out.printf("Third %.2f \n", bookPriceTotal);
    }

    public static double computeBill1(double bookPrice) {
        bookPrice = bookPrice + (bookPrice * 0.8);
        return bookPrice;
    }

    public static double computeBill2(double bookPrice, int bookQuant) {
        bookPrice = (bookPrice + (bookPrice * 0.8) * bookQuant);
        return bookPrice;
    }

    public static double computeBill3(double bookPrice, int bookQuant, double bookVoucher) {
        bookPrice = (bookPrice + (bookPrice * 0.8) * bookQuant);
        bookPrice = (bookPrice - bookVoucher);
        return bookPrice;

    }
}
