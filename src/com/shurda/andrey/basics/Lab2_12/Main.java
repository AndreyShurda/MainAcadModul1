package com.shurda.andrey.basics.Lab2_12;

/**
 * 2) Add to method main() code that creates MyPhone object, invoke swichOn() method  and
 * then invoke call() method with argument of value 1
 * 3) Execute the program.
 * Example of program output:
 * Loading PhoneBook records� OK!
 * Calling to: Name: Boris, phone: 0679878888
 *
 * Lab2_12_4
 * Add to project next classes:
 * class Camera;
 * class Bluetooth;
 * class MemoryCard;
 * class SimCard;
 * class PowerOnButton;
 * class HeadPhones;
 * class PhoneBattery;
 * class PhoneCharger;
 * class PhoneDisplay;
 * class PhoneSpeaker;
 * Analyze and decide how to create each of these classes, like top-level class,
 * like static nested class or like inner class of MyPhone class
 */
public class Main {
    public static void main(String[] args) {
        MyPhone myPhone = new MyPhone();

        myPhone.swichOn();
        myPhone.call(5);
        myPhone.call(3);
    }
}
