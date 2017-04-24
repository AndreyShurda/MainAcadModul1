package com.shurda.andrey.se.Lab1_2.serialaze;

import java.io.*;

/**
 * Create new project called DemoSerialize. Add package “com.brainacad.serialize”.
 * Create class Employee with private fields : String name, String address, int SSN, int number.
 * Add getters and setters to Employee class. Override the toString() method.
 * Create SerializeDemo program which instantiates an Employee object and serializes it to a file.
 * Lab1-2-2
 * Create DeserializeDemo program which de-serializes the Employee object created in the SerializeDemo program.
 * Import the Employee class.
 * Lab1-2-3
 * Modify class Employee (add transient keyword to SSN field)
 */
public class SerializeDemo {
    public static void main(String[] args) throws IOException {
        String nameOfFile = "employee.ser";
        FileOutputStream outputStream = new FileOutputStream(nameOfFile);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(new Employee("Andrey", "Petrov", 1111, 12));
        objectOutputStream.writeObject(new Employee("Andrey", "Ivano", 2222, 23));
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream inputStream = new FileInputStream(nameOfFile);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        Employee employee;

        try {
            while ((employee = (Employee) objectInputStream.readObject()) != null) {
//                student = (Student) objectInputStream.readObject();
                System.out.println(employee);
            }
        } catch (EOFException e) {
            System.out.println("End of file");
            objectInputStream.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
