package com.shurda.andrey.Lab2_12;

/**
 * 2) Add to method main() code that creates MyPhone object, invoke swichOn() method  and
 * then invoke call() method with argument of value 1
 * 3) Execute the program.
 * Example of program output:
 * Loading PhoneBook records… OK!
 * Calling to: Name: Boris, phone: 0679878888
 */
public class Main {
    public static void main(String[] args) {
        MyPhone myPhone = new MyPhone();

        myPhone.swichOn();
        myPhone.call(5);
        myPhone.call(3);
    }
}
