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
 */
public class Main {
    public static void main(String[] args) {
        for (MyDayOfWeek myDayOfWeek : MyDayOfWeek.values()) {
            System.out.println("The day of week is: "+ myDayOfWeek.name());
        }
    }
}
