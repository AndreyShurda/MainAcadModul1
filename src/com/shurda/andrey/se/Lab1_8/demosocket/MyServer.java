package com.shurda.andrey.se.Lab1_8.demosocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MyServer extends Thread {
    private List<Student> users = new ArrayList<>();

    private void initUsers() {
        users.add(new Student(1, "Ivan", "C++"));
        users.add(new Student(2, "Andrii", "JAVA"));
        users.add(new Student(3, "Ira", "PHP"));
        users.add(new Student(4, "Vova", "C#"));
    }
    @Override
    public void run() {
        Socket socket;

        try (ServerSocket serverSocket = new ServerSocket(8899)) {
            System.out.println("Server start");
            initUsers();
            while (true) {
                socket = serverSocket.accept();
                new ThreadClient(users, socket);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}