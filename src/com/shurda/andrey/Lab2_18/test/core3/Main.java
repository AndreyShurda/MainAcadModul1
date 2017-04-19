package com.shurda.andrey.Lab2_18.test.core3;

import java.math.BigDecimal;
import java.text.*;
import java.time.format.DateTimeFormatter;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

/**
 * Create new project called  TestCore3. Add package “com.brainacad.oop.testcore3”.
 * Write a program that demonstrates use of regional settings to work with numbers, currency and date (using Locale, NumberFormat, Currency and Date).
 * 1) Create a class Main with a main() method, which defines the current locale and displays information about regional settings,
 * representation of large numbers, date and currency.
 * 2) Execute the program. The program output must be like next example:
 * Current Locale: русский (Россия)
 * Integer: 2 430 000 000 000
 * Double: 0,002
 * Currency: Russian Ruble: 2 430 000 000 000 руб.
 * Date: Tue Aug 16 18:50:55 EEST 2016
 * 3) Add a main() method of representation of numbers and currencies for China, Italy.
 * 4) Execute the program.
 */
public class Main {
    static long l = 2_430_000_000_000L;
    static double d = 0.002;
    static Date date = new Date();

    public static void main(String[] args) {
        printLocale(Locale.getDefault());
        System.out.println();
        printLocale(Locale.CHINA);
        System.out.println();
        printLocale(Locale.ITALY);
    }

    private static void printLocale(Locale locale) {
        DecimalFormat df = new DecimalFormat("###,###", new DecimalFormatSymbols(locale));
        Currency currency = Currency.getInstance(locale);
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);

        System.out.println("Current Locale: " + locale.getDisplayName());
        System.out.println("Current Locale: " + locale.getDisplayName(locale));
        System.out.println("Integer: " + df.format(l));
        System.out.format(locale, "Double: %.3f%n", +d);
        System.out.println("Currency: " + currency.getDisplayName() + ": " + nf.format(l));
        System.out.println("Date: " + date);
        System.out.println("Date Format: " + dateFormat.format(date));
    }
}
