package com.shurda.andrey.se.Lab1_8.demosocket1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {

    @Override
    public void run() {
        Socket socket;

        try (ServerSocket serverSocket = new ServerSocket(8899)) {
            System.out.println("Server start");
            while (true) {
                socket = serverSocket.accept();
                new ServerThread(socket);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
