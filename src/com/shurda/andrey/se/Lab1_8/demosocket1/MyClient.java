package com.shurda.andrey.se.Lab1_8.demosocket1;

import java.io.*;
import java.net.Socket;

public class MyClient extends Thread {
    public MyClient() {
        this.start();
    }

    @Override
    public void run() {
        BufferedWriter bufferedWriter;
        BufferedReader bufferedReader;
        try (Socket socket = new Socket("localhost", 8899)) {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            for (int i = 0; i < 10; i++) {
                sleep(1000);
                System.out.println(getName() + " :Client send: PING" + (i + 1));
                bufferedWriter.write("PING" + (i + 1) + "\n");
                bufferedWriter.flush();
                System.out.println("Client: receive " + bufferedReader.readLine());
            }
            bufferedWriter.write("exit\n");
            bufferedWriter.flush();

            bufferedWriter.close();
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

