package com.shurda.andrey.Lab2_12;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1) Create new class MyPhone. Rewrite class MyPhoneBook to make it as inner class (non-static) of  MyPhone class
 * (move class MyPhoneBook code inside MyPhone class).
 * Add to class MyPhone constructor with no arguments to initialize the field phonebook.
 * Add to class MyPhone public method swichOn(), which print message “Loading PhoneBook records…” and
 * create MyPhoneBook object and add to it ten phone number records.
 * Then print to console “OK!”;
 * Add to class MyPhone method call(int), which prints to console message “Calling to”
 * and full information from MyPhoneBook element (by index of array).
 */

public class MyPhone {
    private MyPhoneBook myPhoneBook;

    public MyPhone() {
        myPhoneBook = new MyPhoneBook();
    }

    public void swichOn() {
        System.out.print("Loading PhoneBook record... ");

//        MyPhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.addPhoneNumber("Sasha", "050123456");
        myPhoneBook.addPhoneNumber("Vova", "067987654");
        myPhoneBook.addPhoneNumber("Andrii", "099987654");
        myPhoneBook.addPhoneNumber("Ira", "063987654");
        myPhoneBook.addPhoneNumber("Yana", "066987654");
        myPhoneBook.addPhoneNumber("Anna", "051123456");
        myPhoneBook.addPhoneNumber("Viola", "068987654");
        myPhoneBook.addPhoneNumber("Andrii", "098987654");
        myPhoneBook.addPhoneNumber("Irina", "063987654");
        myPhoneBook.addPhoneNumber("Rita", "066987654");

        System.out.println("Ok");
    }

    public void call(int index) {
        System.out.println("Calling to " + myPhoneBook.phoneNumbers[index]);
    }


    class MyPhoneBook {
        private PhoneNumber[] phoneNumbers = new PhoneNumber[10];
        private int countOfPhoneNumber;

        public void addPhoneNumber(String name, String phone) {
            try {
                phoneNumbers[countOfPhoneNumber] = new PhoneNumber(name, phone);
                countOfPhoneNumber++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("The phone book is full");
            }
        }

        public void printPhoneBook() {
            for (int i = 0; i < countOfPhoneNumber; i++) {
                System.out.println(phoneNumbers[i]);
            }
        }

        public void sortByPhoneNumber() {
            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber pn1, PhoneNumber pn2) {
                    if (pn1 == null || pn2 == null)
                        return 1;
                    else
                        return pn1.getPhone().compareToIgnoreCase(pn2.getPhone());
                }
            });
        }

        public void sortByName() {
            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber pn1, PhoneNumber pn2) {
                    if (pn1 == null || pn2 == null)
                        return 1;
                    else
                        return pn1.getName().compareToIgnoreCase(pn2.getName());
                }
            });
        }

        class PhoneNumber {
            private String name;
            private String phone;

            public PhoneNumber(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            public String getPhone() {
                return phone;
            }

            public String getName() {
                return name;
            }

            @Override
            public String toString() {
                return "Name: " + name + ", phone: " + phone;
            }
        }
    }
}
