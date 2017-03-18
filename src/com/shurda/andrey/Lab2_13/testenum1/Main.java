package com.shurda.andrey.Lab2_13.testenum1;

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
 */
public class Main {
    public static void main(String[] args) {
        for (MyDayOfWeek myDayOfWeek : MyDayOfWeek.values()) {
            System.out.println("The day of week is: " + myDayOfWeek.name());
        }

        System.out.println();
        System.out.println("Lab2_13_2");
        classesInJava();
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
