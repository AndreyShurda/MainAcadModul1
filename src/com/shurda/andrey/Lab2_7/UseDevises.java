package com.shurda.andrey.Lab2_7;

/**
 * Override toString() method in each class.
 * In toString() method provide code which prints class name and fields values.
 * Example:
 * Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
 * Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024
 */
public class UseDevises {
    public static void main(String[] args) {
        Device device = new Device("Sumsung", 120, "AB1234567CD");
        Device monitor = new Monitor("Sumsung", 120, "AB1234567CD", 1280, 1024);

        System.out.println(device.toString());
        System.out.println(monitor.toString());
    }
}
