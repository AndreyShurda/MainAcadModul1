package com.shurda.andrey.se.Lab1_8.demosocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class MyClient extends Thread {
    Student student;

    public MyClient(Student student) {
        this.student = student;
        this.start();
    }

    @Override
    public void run() {
        ObjectOutputStream outputStream = null;
        BufferedReader bufferedReader = null;
        String name = getName() + " Client ";
        try (Socket socket = new Socket("localhost", 8899)) {
            System.out.println(name + "start");
            outputStream = new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeObject(student);
//            System.out.println("Client send object");

            sleep(500);

            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(name + "receive msg from server: " + str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}