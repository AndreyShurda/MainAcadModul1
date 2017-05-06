package com.shurda.andrey.se.Lab1_7.tetsapidate;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

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
        System.out.println("My birthday: " + myBirthday);

        Period myPeriod = Period.between(myBirthday, localDate);
        int myYears = myPeriod.getYears();
        System.out.println("I am " + myYears);


        System.out.println("I was born on day of the week: " + myBirthday.getDayOfWeek());
        System.out.println("My birthday in this year will be on day of the week: " + myBirthdayDayOfWeek(myBirthday));

        System.out.print("My Birthday in this year: ");
        isBirthDayWas(myBirthday);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH-mm-ss");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Now is: " + localDateTime.format(formatter));

        ZoneId kiev = ZoneId.of("Europe/Kiev");
        ZoneId berlin = ZoneId.of("Europe/Berlin");
        ZonedDateTime kievZonedDateTime = ZonedDateTime.of(localDateTime, kiev);
        ZonedDateTime berlinZonedDateTime = kievZonedDateTime.withZoneSameInstant(berlin);

        System.out.println("In Kiev now is: " + kievZonedDateTime.format(formatter));
        System.out.println("In Berlin now is: " + berlinZonedDateTime.format(formatter));
    }

    public static void isBirthDayWas(LocalDate birthday) {
        LocalDate localDate = LocalDate.now();
        LocalDate birthdayInThisYear = birthdayInThisYear(birthday);
        Period period = Period.between(localDate, birthdayInThisYear);

        if (period.isNegative()) {
            System.out.println("past already");
        } else if (period.isZero()) {
            System.out.println("birthday today");
        } else {
            System.out.println("will be soon");
        }
    }

    public static DayOfWeek myBirthdayDayOfWeek(LocalDate birthday) {
        LocalDate birthdayInThisYear = birthdayInThisYear(birthday);

        return birthdayInThisYear.getDayOfWeek();
    }

    private static LocalDate birthdayInThisYear(LocalDate birthday) {
        LocalDate localDate = LocalDate.now();

        int year = localDate.getYear();
        int month = birthday.getMonthValue();
        int dayOfMonth = birthday.getDayOfMonth();

        return LocalDate.of(year, month, dayOfMonth);
    }
}
