package com.shurda.andrey.Lab2_12.nest1;

/**
 * Created by User on 12.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyPhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.addPhoneNumber("Sasha", "050123456");
        myPhoneBook.addPhoneNumber("Vova", "067987654");

        myPhoneBook.printPhoneBook();
    }
}
