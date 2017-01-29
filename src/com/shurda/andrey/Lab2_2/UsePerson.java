package com.shurda.andrey.Lab2_2;

/**
 * Created by User on 29.01.2017.
 */
public class UsePerson {
    public static void main(String[] args) {
        Person person = new Person();

        person.fieldList("Andrey");
        person.fieldList("Andrey","Shurda");
        person.fieldList("Andrey","Shurda",27);
        person.fieldList("Andrey","Shurda",27, "J");
        person.fieldList("Andrey","Shurda",27, "J", 1235468);

        System.out.println(person.toString());

    }
}
