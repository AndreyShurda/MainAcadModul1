package com.shurda.andrey.se.Lab1_8.demosocket;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class ThreadClient extends Thread {
    private List<Student> users;
    private Socket socket;

    public ThreadClient(List<Student> users, Socket socket) {
        this.users = users;
        this.socket = socket;
        this.start();
    }

    @Override
    public void run() {
        ObjectInputStream objectInputStream = null;
        BufferedWriter bufferedWriter = null;
        try {
            String msg = "This student not access";
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            try {
                Student student = (Student) objectInputStream.readObject();

                if (users.contains(student)) {
                    msg = student + " This student has access";
//                    msg = "This student has access";
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            bufferedWriter.write(msg);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}