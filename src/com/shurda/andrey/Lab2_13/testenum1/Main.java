package com.shurda.andrey.Lab2_13.testenum1;

import java.util.Scanner;

/**
 * 1) Create a class Main with a main().
 * 2) Create a enum type MyDayOfWeek which specify a days-of-the-week (SUNDAY, MONDAY, …).
 * 3) Add to method main() code that iterate over MyDayOfWeek enum possible values in loop and print each value name to console.
 * 4) Execute the program.
 * Example of program output:
 * SUNDAY
 * MONDAY
 * TUESDAY
 * WEDNESDAY
 * THURSDAY
 * FRIDAY
 * SATURDAY
 * <p>
 * Lab2_13_2
 * Add to method main() code that iterate over MyDayOfWeek enum possible values in loop and using switch statement
 * print to console days of the week only when you have classes in Java Programming.
 * Execute the program.
 * Example of program output:
 * My Java day: TUESDAY
 * My Java day: THURSDAY
 * My Java day: SATURDAY
 * <p>
 * Lab2_13_3
 * Rewrite MyDayOfWeek enum, add method nextDay() which return the next day of week on for given enum value.
 * For example: MyDayOfWeek.FRIDAY.nextDay() must return MyDayOfWeek.SATURDAY. Add to method main()
 * code that read string value from console (using System.in and Scanner), then you must parse string value
 * to particular enum value (using valueOf() method) and then print the name of next day of week to console.
 * Execute the program.
 * Example of program output:
 * FRIDAY
 * The next day of week: SATURDAY
 */
public class Main {
    public static void main(String[] args) {
        for (MyDayOfWeek myDayOfWeek : MyDayOfWeek.values()) {
            System.out.println("The day of week is: " + myDayOfWeek.name());
        }

        System.out.println();
        System.out.println("Lab2_13_2");
        classesInJava();


        System.out.println();
        System.out.println("Lab2_13_3");
        getNextDayOfWeek();
    }

    public static void getNextDayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        boolean isDay = false;
        do {
            System.out.print("Enter day of week: ");

            String currentDay = scanner.nextLine().toUpperCase();
            isDay = MyDayOfWeek.nextDay(currentDay);
        } while (!isDay);
    }

    public static void classesInJava() {
        for (MyDayOfWeek days : MyDayOfWeek.values()) {
            switch (days) {
                case TUESDAY:
                    System.out.println("My Java day: " + days.name());
                    break;
                case THURSDAY:
                    System.out.println("My Java day: " + days.name());
                    break;
                case SATURDAY:
                    System.out.println("My Java day: " + days.name());
                    break;
            }
        }
    }

}
