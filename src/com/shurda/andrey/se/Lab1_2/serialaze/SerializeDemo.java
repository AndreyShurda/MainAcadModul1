package com.shurda.andrey.se.Lab1_2.serialaze;

import java.io.*;

/**
 * Created by Admin on 23.04.2017.
 */
public class SerializeDemo {
    public static void main(String[] args) throws IOException {
        String nameOfFile = "employee.ser";
        FileOutputStream outputStream = new FileOutputStream(nameOfFile);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(new Employee("Andrey", "Petrov", 1111,12));
        objectOutputStream.writeObject(new Employee("Andrey", "Ivano", 2222,23));
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
