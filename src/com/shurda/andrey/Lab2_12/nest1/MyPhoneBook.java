package com.shurda.andrey.Lab2_12.nest1;

/**
 * Create a class MyPhoneBook which contains static nested class PhoneNumber.
 * 1) Add to class PhoneNumber two fields: name (of String type) and phone (оf String type),
 * constructor with two parameters (name, phone) and getters for each class field.
 * Override the toString() method in PhoneNumber to return information about name and phone number.
 * 2) Add to class MyPhoneBook private field phoneNumbers as array of PhoneNumber (array length of 10).
 * 3) Add to class MyPhoneBook public method addPhoneNumber() with two parameters, of String type (name, phone)
 * which use it to create new PhoneNumber object and pass it to next available array element.
 * 4) Add to class MyPhoneBook public method printPhoneBook() which iterates over phoneNumbers array in loop
 * and print name and phone number information of each record to console.
 * 5) Create a class Main with a main() method.
 * Add to method main() code that creates MyPhoneBook object and fill it with five phone number records.
 * Add code to invoke printPhoneBook() method.
 * 6) Execute the program.
 * Example of program output:
 * Name: Sasha, phone: 050123456
 * Name: Vova, phone: 067987654
 */
public class MyPhoneBook {
    PhoneNumber[] phoneNumbers = new PhoneNumber[10];
    private static int countOfPhoneNumbers;

    public void addPhoneNumber(String name, String phone) {
        phoneNumbers[countOfPhoneNumbers] = new PhoneNumber(name, phone);
    }

    public void printPhoneBook() {
        for (int i = 0; i < countOfPhoneNumbers; i++) {
            System.out.println(phoneNumbers[i]);
        }
    }

    public static class PhoneNumber {
        private String name;
        private String phone;

        public PhoneNumber(String name, String phone) {
            countOfPhoneNumbers++;
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString() {
            return  "name: " + name +
                    ", phone: " + phone;
        }
    }
}
