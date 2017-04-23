package com.shurda.andrey.se.Lab1_2.serialaze_user;

import com.shurda.andrey.se.Lab1_2.Employee;

import java.io.*;

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
        User user = new User("Ivan", "Ivanov", 23);


        String nameOfFile = "users.txt";
        serialazibleUser(user, nameOfFile);

//        deserializableUser(nameOfFile);

//        RandomAccessFile file = new RandomAccessFile(nameOfFile, "r");
//
//        String line;
//        long pointer = 0;
//        while ((line = file.readLine()) != null) {
////            pointer += line.length() - 1;
//            String[] splitArray = line.replace(" ","").split(",");
//
//            for (String s : splitArray) {
//                System.out.println(s);
//            }
//        }




    }

    private static void deserializableUser(String nameOfFile) throws IOException {
        FileInputStream inputStream = new FileInputStream(nameOfFile);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        User user;

        try {
            while ((user = (User) objectInputStream.readObject()) != null) {
//                student = (Student) objectInputStream.readObject();
                System.out.println(user);
            }
        } catch (EOFException e) {
            System.out.println("End of file");
            objectInputStream.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void serialazibleUser(User user, String nameOfFile) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(nameOfFile);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(user.getFirstName());
        objectOutputStream.writeObject(user.getLastName());
        objectOutputStream.writeInt(user.getAge());

        objectOutputStream.flush();
        objectOutputStream.close();

//        RandomAccessFile file = new RandomAccessFile(nameOfFile, "rw");
//
//        String line;
//        long pointer = 0;
//        while ((line = file.readLine()) != null) {
//            pointer += line.length() - 1;
//        }
//        file.seek(pointer);
////        file.writeBytes(user.toString() + "\n");
//        file.writeBytes(user.getFirstName());
//        file.writeBytes(user.getLastName());
//        file.writeBytes(String.valueOf( user.getAge()));
//        System.out.println(user + " add to file");
//        file.close();
    }
}
