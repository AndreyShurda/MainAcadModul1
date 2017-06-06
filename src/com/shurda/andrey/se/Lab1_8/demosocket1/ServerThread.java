package com.shurda.andrey.se.Lab1_8.demosocket1;

import java.io.*;
import java.net.Socket;


public class ServerThread extends Thread {

    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
        this.start();
    }

    @Override
    public void run() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String str;
            int i = 0;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(getName() + ": Server received " + str);
                if (str.equals("exit")) {
                    break;
                }
                bufferedWriter.write(getName() + ": " + str.substring(0, str.length() - 1) + "-PONG" + (++i) + "\n");
                bufferedWriter.flush();
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
