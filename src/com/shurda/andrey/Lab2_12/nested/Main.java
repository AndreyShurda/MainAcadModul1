package com.shurda.andrey.Lab2_12.nested;

/**
 * Created by admin on 13.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyPhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.addPhoneNumber("Sasha", "050123456");
        myPhoneBook.addPhoneNumber("Vova", "067987654");

        myPhoneBook.printPhoneBook();
    }
}
