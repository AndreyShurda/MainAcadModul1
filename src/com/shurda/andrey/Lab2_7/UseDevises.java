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
        Device device2 = new Device("Sumsung", 120.0, "AB1234567CD");


        Device monitor = new Monitor("Sumsung", 120, "AB1234567CD", 1280, 1024);
        Device monitor2 = new Monitor("Sumsung", 120, "AB1234567CD", 1280, 1023);

        Device ethAdapth = new EthernetAdapter("Sumsung", 120, "AB1234567CD", 12, "AA:FF:4C:45");
        Device ethAdapth2 = new EthernetAdapter("Sumsung", 120, "AB1234567CD", 12, "AA:FF:4C:45");


        System.out.println("Equals device: " + device.equals(device2));
        System.out.println("Equals monitor: " + monitor.equals(monitor2));
        System.out.println("Equals ethernet: " + ethAdapth.equals(null));

        System.out.println("device hashcode :"+monitor.hashCode());
        System.out.println("device2 hashcode :"+monitor2.hashCode());

        System.out.println(device.toString());
        System.out.println(monitor.toString());
        System.out.println(ethAdapth.toString());
    }
}
