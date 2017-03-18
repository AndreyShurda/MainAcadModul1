package com.shurda.andrey.Lab2_13.testenum1;

/**
 * Created by admin on 18.03.2017.
 */
public enum MyDayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public static boolean nextDay(String day) {
        try {
            int currentDay = valueOf(day).ordinal() + 1;
            MyDayOfWeek[] days = values();
            System.out.println("The next day of week: " + days[currentDay % days.length]);
            return true;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }
}
