package com.shurda.andrey.basics.Lab2_7;

import java.util.Arrays;

/**
 * Create program (class Main). The program must demonstrate the creation of an arrays
 * of different types devices, setup and output characteristics of each device
 */
public class Main {
    public static void main(String[] args) {
        Device[] devices = new Device[0];

        devices = addDevice(devices, new Device("Sumsung", 120, "AB1234567CD"));
        devices = addDevice(devices, new Device("Sony", 100, "123456789"));
        devices = addDevice(devices, new Device("LG", 1000, "AA1234567"));

        devices = addDevice(devices, new Monitor("Sumsung", 120, "AB1234567CD", 1920, 1080));
        devices = addDevice(devices, new Monitor("Sony", 100, "123456789", 1280, 720));
        devices = addDevice(devices, new Monitor("LG", 1000, "AA1234567", 2500, 1080));

        devices = addDevice(devices, new EthernetAdapter("Sumsung", 120, "AB1234567CD", 100, "AA:FF:4A:55:C8"));
        devices = addDevice(devices, new EthernetAdapter("Sony", 100, "123456789", 10, "AB:FF:4A:55:C8"));
        devices = addDevice(devices, new EthernetAdapter("LG", 1000, "AA1234567", 2500, "AA:F3:41:55:C4"));


        printAllDevice(devices);

    }

    public static void printAllDevice(Device[] devices) {
        for (Device device : devices) {
            System.out.println(device);
        }
    }

    public static Device[] addDevice(Device[] devices, Device newDevice) {
        Device[] newArrayDevices = Arrays.copyOf(devices, devices.length + 1);
        newArrayDevices[newArrayDevices.length - 1] = newDevice;
        return newArrayDevices;
    }
}
