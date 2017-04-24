package com.shurda.andrey.se.Lab1_2.externazible;

import com.shurda.andrey.se.Lab1_2.serialaze.Employee;
import com.shurda.andrey.se.Lab1_2.serialaze_user.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Open project DemoSerialize (from 1.2.4 labs).
 * 1) Modify class User replacing the implementation of Serializable on interface Externalizable.
 * Override methods writeExternal (ObjectOutput out) and readExternal (Object Input in);
 * 2) Create a class Main with a main() method, which initializes an array of User users;
 * 3) Add code in a main() method that writes an array of users in the "userfile.ser" file;
 * 4) Add code in a main() method that reads from a file "userfile.ser"  all users and prints them to the console.
 * 5) Execute the program.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String nameOfFile = "userfile.ser";

        List<User> users = new ArrayList<>();

        users.add(new User("Polina", "Kalina", 45));
        users.add(new User("Jack", "Brown", 22));
        users.add(new User("Michael", "Green", 20));

        externazible(nameOfFile, users);

        deexternazible(nameOfFile);
    }

    private static <T> void externazible(String nameOfFile, List<T> list) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(nameOfFile));

        for (T record : list) {
            objectOutputStream.writeObject(record);
        }

        objectOutputStream.flush();
        objectOutputStream.close();
    }

    private static <T> void deexternazible(String nameOfFile) throws IOException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(nameOfFile));

        T record;

        try {
            while ((record = (T) objectInputStream.readObject()) != null) {
                System.out.println(record);
            }
        } catch (EOFException e) {
            System.out.println("End of file");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        objectInputStream.close();
    }
}
