package com.shurda.andrey.se.Lab1_8.datagram;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Add package “com.brainacad.datagram”.
 * 1) Create a class MySender with a main() method, which:
 * - enters the file name for his transmission over the network;
 * - creates a socket connection on the basis of DatagramSocket class and organizes packet for transmission in the form
 * of an instance of a DatagramPacket class.
 * 2) Create a class MyRecipient with a main() method, which:
 * - creates a buffer for receiving data packets and a file for writing data;
 * - creates a socket connection on the basis of DatagramSocket class and organizes the wait loop of data packets,
 * which receives the data and writes it to a file.
 * 3) Execute the programs.
 */

public class MySender {
    public static void main(String[] args) throws IOException {
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
