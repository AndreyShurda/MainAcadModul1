package com.shurda.andrey.se.Lab1_1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Write a program that saves user name and the number of his visits to the company website in the file:
 * 1) Create with field a file (type RandomAccessFile), which is associated with the file "users.txt",
 * containing the user's name and the number of his visits to the company's website in the format: "nameUser:number".
 * For example,
 * Sidorov:2
 * Govga:1
 * Danilina:3
 * ..
 * 2) Add in AccountingUser class the testUsers(String name User) method, which adds a new user to end the file,
 * while the existing - increases the number of visits;
 * 3) Add in AccountingUser class the printFile() method, which prints the contents of the file "users.txt";
 * 4) Add in AccountingUser class override finalize() method to close the file "users.txt";
 * 5) Create a class Main with a main() method, which creates a scanner for entering a user name, visit the company website,
 * and then tests it on a previous visit.
 */
public class Main {
    public static void main(String[] args) {
        AccountingUser accountingUser = new AccountingUser();
        accountingUser.testUsers("Govga");
        accountingUser.printFile();
        accountingUser.testUsers("Sidorov");
        accountingUser.printFile();
        accountingUser.testUsers("Ruslan");
        accountingUser.printFile();
        accountingUser.testUsers("Danilina12");
        accountingUser.printFile();
        accountingUser.testUsers("Danilina");
        accountingUser.printFile();
    }
}
