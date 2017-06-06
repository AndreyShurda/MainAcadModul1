package com.shurda.andrey.se.Lab1_8.datagram;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MyRecipient {
    public static void main(String[] args) throws IOException {
        DatagramSocket server = new DatagramSocket(9999);
        byte[] receiveData = new byte[1024];
        System.out.println("Server UDP start");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("receiveUDP.txt")));
        while (true) {
            DatagramPacket packet = new DatagramPacket(receiveData, receiveData.length);
            server.receive(packet);

            bufferedWriter.write(new String(packet.getData()));
            System.out.println("RECEIVED: " + new String(packet.getData()));

        }
    }

}
