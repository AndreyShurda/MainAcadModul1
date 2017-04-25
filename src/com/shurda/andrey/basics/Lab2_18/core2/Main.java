package com.shurda.andrey.basics.Lab2_18.core2;

import java.math.BigDecimal;

/**
 * Create new project called  TestCore2. Add package “com.brainacad.oop.testcore2”.
 * Write a program that counts how many nails can be purchased at $1 and what will surrender if they buy one
 * of each kind of the nail (nails cost: $0.1, $0.2, $0.3, etc).
 * The program output must be like next example:
 * 4 items bought.
 * Money left over: $0.00
 */
public class Main {
    public static void main(String[] args) {
        double price = 0.1;
        nailsCost(new BigDecimal(String.valueOf(price)));
    }

    private static void nailsCost(BigDecimal price) {
        int items = 0;
        BigDecimal dolar = BigDecimal.ONE;

        while (dolar.compareTo(price) >= 0) {
            items++;
            dolar = dolar.subtract(price);
        }

        System.out.println(items + " items bought.");
        System.out.println("Money left over: $" + dolar.setScale(2, BigDecimal.ROUND_HALF_DOWN));
    }
}
