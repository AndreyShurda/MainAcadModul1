package com.shurda.andrey.se.Lab1_1;

import java.io.*;
import java.util.*;

public class AccountingUser {
    private static final String fileName = "users.txt";
    private RandomAccessFile file = null;
    private static Map<String, Integer> users = new LinkedHashMap<>();

    public AccountingUser() {
        readFile();
    }

    private void readFile() {
        try {
            file = new RandomAccessFile(fileName, "r");
            String line;
            while ((line = file.readLine()) != null) {
                String[] record = line.split(":");
                users.put(record[0], Integer.parseInt(record[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void validUser(String name) {
        if (users.get(name) != null) {
            Integer visitNumber = users.get(name);
            users.put(name, ++visitNumber);
        } else {
            users.put(name, 1);
        }
    }

    public void testUsers(String name) {
        try {
            file = new RandomAccessFile(fileName, "rw");
            String line;

            int sizePrevUsersFile = users.size();
            validUser(name);

            if (sizePrevUsersFile == users.size()) {
                long filePointer = 0;
                while ((line = file.readLine()) != null) {
                    if (line.contains(name)) {
                        int index = line.indexOf(":");
                        int numberOfVisit = Integer.valueOf(line.substring(index + 1));

                        filePointer += index + 1;

                        if (String.valueOf(numberOfVisit).length() == String.valueOf(++numberOfVisit).length()) {
                            file.seek(filePointer);
                            file.writeBytes(String.valueOf(numberOfVisit));
                            break;
                        } else {
                            file.seek(0);
                            Iterator<Map.Entry<String, Integer>> iterator = users.entrySet().iterator();

                            while (iterator.hasNext()) {
                                Map.Entry<String, Integer> next = iterator.next();

                                String record = next.getKey() + ":" + next.getValue() + "\n";
                                System.out.print(record);
                                file.writeBytes(record);
                            }
                        }

                    } else {
                        filePointer += line.length() + 1;
                    }
                }
            } else {
                file.seek(file.length());
                file.writeBytes("\n" + name + ":" + users.get(name));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printFile() {
        try {
            file = new RandomAccessFile(fileName, "r");
            String line;
            while ((line = file.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        file.close();
    }
}
