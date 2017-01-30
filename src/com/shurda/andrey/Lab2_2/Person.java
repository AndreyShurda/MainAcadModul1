package com.shurda.andrey.Lab2_2;

/**
 * Create class Person with fields
 * firstName(String), lastName(String), age(int), gender(String), phoneNumber(int),
 * and five overloaded methods that set this fields with different arguments list.
 * Create class that will be use instance of class Person and his methods.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int phoneNumber;

    public void fieldList(String firstName) {
        setFirstName(firstName);
     }

    public void fieldList(String firstName, String lastName) {
        fieldList(firstName);
        setLastName(lastName);
    }

    public void fieldList(String firstName, String lastName, int age) {
        fieldList(firstName, lastName);
        setAge(age);
    }

    public void fieldList(String firstName, String lastName, int age, String gender) {
        fieldList(firstName, lastName, age);
        setGender(gender);
    }

    public void fieldList(String firstName, String lastName, int age, String gender, int phoneNumber) {
        fieldList(firstName, lastName, age, gender);
        setPhoneNumber(phoneNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", phoneNumber=" + getPhoneNumber() +
                '}';
    }
}
