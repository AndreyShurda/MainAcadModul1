package com.shurda.andrey.se.Lab1_2;

import java.io.Serializable;

/**
 * Create new project called DemoSerialize. Add package “com.brainacad.serialize”.
 * Create class Employee with private fields : String name, String address, int SSN, int number.
 * Add getters and setters to Employee class. Override the toString() method.
 * Create SerializeDemo program which instantiates an Employee object and serializes it to a file.
 */
public class Employee implements Serializable {
    private String name;
    private String address;
    private int SSN;
    private int number;

    public Employee(String name, String address, int SSN, int number) {
        this.name = name;
        this.address = address;
        this.SSN = SSN;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", SSN=" + SSN +
                ", number=" + number +
                '}';
    }
}
