package com.shurda.andrey.se.Lab1_8.datagram;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MySender {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("UDP.txt")));
        DatagramSocket client = new DatagramSocket();
        InetAddress inetAddress = InetAddress.getByName("localhost");

        System.out.println("Client UDP start");
        String sentence;
        while ((sentence = bufferedReader.readLine()) != null) {
            byte[] sendData = sentence.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, inetAddress, 9999);
            client.send(sendPacket);

        }


    }
}
