package com.shurda.andrey.se.Lab1_7.tetsapidate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Add package “com.brainacad.oop.testapidate”. Create a class Main with a main() method, which:
 * 1) Determine and output the current date and the date of birth, and then define and output the number of your years;
 * 2) Determine in which day of the week you were born and what day of the week will be the birthday of this year,
 * then determine was whether this year's birthday;
 * 3) Define a new date and time format (example, "dd.MM.yyyy, HH-mm-ss").
 * Then determine the current date and time for the multiple time-zones and output them in a new format.
 */
public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Date now is: " + localDate);

        LocalDate myBirthday = LocalDate.of(1989, 07, 22);
        int myYears = localDate.getYear() - myBirthday.getYear();

        long yearsBetween = ChronoUnit.YEARS.between(myBirthday, localDate);
        System.out.println("I am " + yearsBetween);
        if (localDate.getMonth().getValue() < myBirthday.getMonth().getValue()) {
            myYears--;
        }

        System.out.println("I am " + myYears);

        System.out.println("My birthday: " + myBirthday);
//        System.out.println("My birthday week: " + myBirthday.getDayOfWeek());
        System.out.println("I was born on day of the week: " + myBirthday.getDayOfWeek());
        System.out.println("My birthday in this year will be on day of the week: " + myBirthday.plusYears(28).getDayOfWeek());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH-mm-ss");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(formatter));

        Period between = Period.between(myBirthday,localDate);

        System.out.println("Period");
        System.out.println(between.plusYears(1));
        System.out.println(between.getDays());
        System.out.println(between);
    }
}
