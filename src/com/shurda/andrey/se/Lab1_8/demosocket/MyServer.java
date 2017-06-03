package com.shurda.andrey.se.Lab1_8.demosocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {

    @Override
    public void run() {
        ObjectInputStream objectInputStream = null;
        BufferedWriter bufferedWriter;
        Socket socket = null;
        ;
        try (ServerSocket serverSocket = new ServerSocket(8899)) {
            System.out.println("Server start");
            socket = serverSocket.accept();
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            try {
                Student student = (Student) objectInputStream.readObject();
                System.out.println(student);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            System.out.println("Server send for client msg");
            bufferedWriter.write("I receive object");
            bufferedWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
