package com.shurda.andrey.se.Lab1_1;

import java.io.*;

/**
 * Write a program that saves user name and the number of his visits to the company website in the file:
 * 1) Create with field a file (type RandomAccessFile), which is associated with the file "users.txt",
 * containing the user's name and the number of his visits to the company's website in the format: "nameUser:number".
 * For example,
 * Sidorov:2
 * Govga:1
 * Danilina:3
 * ……..
 * 2) Add in AccountingUser class the testUsers(String name User) method, which adds a new user to end the file,
 * while the existing - increases the number of visits;
 * 3) Add in AccountingUser class the printFile() method, which prints the contents of the file "users.txt";
 * 4) Add in AccountingUser class override finalize() method to close the file "users.txt";
 * 5) Create a class Main with a main() method, which creates a scanner for entering a user name, visit the company website,
 * and then tests it on a previous visit.
 */
public class AccountingUser {
    String fileName = "users.txt";
    RandomAccessFile file = null;

    public void testUsers(String name) {
        try {
            file = new RandomAccessFile(fileName, "rw");
//            file.seek(0);
            String line;
            while ((line = file.readLine()) != null) {
//                System.out.println(line);
                if (line.contains(name)) {
                    System.out.println(line.contains(name));
                    int index = line.indexOf(":");
//                    file.seek(index + 1);
                    int numberOfVisit = Integer.valueOf(line.substring(index + 1));
                    System.out.println("read = " + numberOfVisit);
                    numberOfVisit++;
                    file.seek(index+1);
                    file.write(new byte[]{(byte)numberOfVisit});
//                    System.out.println(index);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printFile() {
        try {
            BufferedReader inputStream;

            inputStream = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = inputStream.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    System.out.println(word);
                }
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
