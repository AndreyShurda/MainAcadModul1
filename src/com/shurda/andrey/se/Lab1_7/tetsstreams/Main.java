package com.shurda.andrey.se.Lab1_7.tetsstreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Create new project called  TestStream. Add package “com.brainacad.oop.teststreams”.
 * 1) Create a class Main with a main() method, which: -  create and output a list of integers using Stream functions:
 * create an infinite stream of integers, starting at 10 and increasing every next on 10, then restrict it 10 the first
 * elements, which are then halved and collect the list; - create a list of strings of 10 elements and then using the
 * Stream, select, sort and print the lines starting with some a symbol.
 * 2) Create a class Person with private fields: name, age and gender, as well as getter and setter methods,
 * and constructor, and overridden a toString() method.  Add in a main() method to create a collection of objects of type Person. 
 * Then using Stream, select and print to the console all military men (from 18 to 27 years old).
 * 3) Determine for list objects of Person type the average age of women with using Stream.a collection of objects of type Person
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Integer to stream");

        List<Integer> list = IntStream.iterate(10, n -> n + 10)
                .limit(10)
                .map(n -> n / 2)
                .boxed()
                .collect(Collectors.toList());
//                .forEach(System.out::println);

        System.out.println(list);

        System.out.println();
        System.out.println("List<String> to stream");
        List<String> listStrings = new ArrayList<>();
        listStrings.add("qwer13");
        listStrings.add("q1w");
        listStrings.add("1qwer13");
        listStrings.add("qqwer");
        listStrings.add("rrqwer3");
        listStrings.add("er13");
        listStrings.add("13");
        listStrings.add("er13");
        listStrings.add("eqwr13");
        listStrings.add("wweter13");

        String symbol = "q";
        listStrings = listStrings.stream()
//                .map(n -> n.substring(0, 1))
                .filter(n -> n.startsWith(symbol))
                .collect(Collectors.toList());

        System.out.println(listStrings);


        System.out.println();
        Collection<Person> persons = new ArrayList<>();

        persons.add(new Person("Andrey", 27, 'm'));
        persons.add(new Person("Ira", 27, 'w'));
        persons.add(new Person("Rita", 18, 'w'));
        persons.add(new Person("Rita", 23, 'w'));
        persons.add(new Person("Ivan", 35, 'm'));
        persons.add(new Person("Petro", 18, 'm'));
        persons.add(new Person("Ivan", 45, 'm'));

//        System.out.println(persons);
        persons.forEach(person -> System.out.println(person));

        System.out.println();
        System.out.println("All military men (from 18 to 27 years old)");
        persons.stream()
                .filter(person -> person.getGender() == 'm' && person.getAge() >= 18 && person.getAge() <= 27)
                .forEach(System.out::println);


        char gender = 'w';
        System.out.println();
        System.out.print("Average age of women is: ");
        double avergeAge = persons.stream()
                .filter(n -> n.getGender() == gender)
                .mapToInt(n -> n.getAge())
                .average()
                .getAsDouble();
//                .collect(Collectors.averagingInt(n -> n.getAge()));

        System.out.println((int) avergeAge);
    }
}
