package com.shurda.andrey.Lab2_2;

/**
 * Created by User on 29.01.2017.
 */
public class UsePerson {
    public static void main(String[] args) {
        Person person = new Person();

        person.fieldList("Ivan");
        System.out.println(person.toString());

        person.fieldList("Andrey", "Ivanov");
        System.out.println(person.toString());

        person.fieldList("Olexandr", "Ivanov", 27);
        System.out.println(person.toString());

        person.fieldList("Oleg", "Volk", 25, "M");
        System.out.println(person.toString());

        person.fieldList("Olga", "Popova", 28, "W", 0632410710);
        System.out.println(person.toString());
    }
}
