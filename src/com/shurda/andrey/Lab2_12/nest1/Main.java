package com.shurda.andrey.Lab2_12.nest1;


/**
 * Open project TestNested1 from 2-12-1 lab.
 * 1) Add to class MyPhoneBook two public methods sortByName() and sortByPhoneNumber().
 * Provide code in sortByName() method to sort PhoneNumbers array by name
 * (using Comparator interface and anonymous class). Provide code in sortByPhoneNumber () method
 * to sort PhoneNumbers array by phone (using Comparator interface and anonymous class).
 * 2) Add to method main() code that creates MyPhoneBook object and fill it with ten phone number records.
 * 3) Add code to sort phone numbers in phone book by invoking sortByName() and then invoke printPhoneBook() method.
 * Execute the program.
 * Example of program output:
 * Name: Anna, phone: 0501237777
 * Name: Boris, phone: 0679878888
 */
public class Main {
    public static void main(String[] args) {
        MyPhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.addPhoneNumber("Sasha", "050123456");
        myPhoneBook.addPhoneNumber("Vova", "067987654");
        myPhoneBook.addPhoneNumber("Andrey", "099987654");
        myPhoneBook.addPhoneNumber("Anna", "093987654");

        System.out.println("call method printPhoneBook");
        myPhoneBook.printPhoneBook();

        System.out.println();
        System.out.println("call method sortByName");
        myPhoneBook.sortByName();
        myPhoneBook.printPhoneBook();

        System.out.println();
        System.out.println("call method sortByPhoneNumber");
        myPhoneBook.sortByPhoneNumber();
        myPhoneBook.printPhoneBook();
    }
}
