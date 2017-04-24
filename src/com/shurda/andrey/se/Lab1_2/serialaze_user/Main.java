package com.shurda.andrey.se.Lab1_2.serialaze_user;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Create new project called SerializeUser. Add package “com.brainacad.serialize_user”.
 * 1) Create class User with private fields : String firstName, String lastName, int age.
 * Add getters and setters to User class. Add two constructors: one with no arguments, another with parameters.
 * Override the toString() method.
 * 2) Create a class Main with a main() method, which creates an instance User and adds it to the "users.ser" file using
 * serialization (Note, to append to a file, use class RandomAccessFile and a method of writeBytes(String ...));
 * 3) Add code in a main() method that reads from a file "users.ser" using de-serialization all users and prints them
 * to the console.
 * 4) Execute the program.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String nameOfFile = "users.txt";
        List<User> users = new ArrayList<>();

        users.add(new User("IRA", "Petrova", 18));
        users.add(new User("Ivan", "Ivanov", 25));
        users.add(new User("Sasha", "Popova", 31));

        deleteFile(nameOfFile);
        for (User user : users) {
            serialazibleUser(user, nameOfFile);
        }

        deserializableUser(nameOfFile);

    }

    private static void deserializableUser(String nameOfFile) throws IOException {
        RandomAccessFile file = new RandomAccessFile(nameOfFile, "r");

        String line;
        while ((line = file.readLine()) != null) {

            String[] splitArray = line.split(",");
            User user = new User();

            user.setFirstName(splitArray[0]);
            user.setLastName(splitArray[1]);
            user.setAge(Integer.valueOf(splitArray[2]));

            System.out.println(user);
        }
        file.close();
    }

    private static void serialazibleUser(User user, String nameOfFile) throws IOException {
        RandomAccessFile file = new RandomAccessFile(nameOfFile, "rw");

        String line;
        while ((line = file.readLine()) != null) {
        }

        file.getFilePointer();
        file.writeBytes(user.toString() + "\n");

        file.close();
    }

    private static void deleteFile(String fileName) {
        File file = new File(fileName);

           if (file.delete()){
               System.out.println("File " +fileName+" delete successful");
           }else {
               System.out.println("This file " +fileName+" does not exist");
           }
    }
}
