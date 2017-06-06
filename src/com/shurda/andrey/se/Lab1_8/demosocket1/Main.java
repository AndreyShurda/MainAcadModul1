package com.shurda.andrey.se.Lab1_8.demosocket1;

import com.shurda.andrey.se.Lab1_8.demosocket1.MyServer;

/**
 * Create new project called DemoSocket1. Add package “com.brainacad.demosocket1.
 * 1) Write a program (for example, MyClient), which creates a socket connection to another program, and then in a loop
 * on of 10 iterations sends her string "PING" and outputs the response. Iterations are performed with a delay of 1 second.
 * 2) Write a program (for example, MyServer), which is in an infinite loop creates a new socket connection upon request
 * from another program, and then creates a separate thread to communicate with the program.
 * 3) Add to the program MyServer a ServerThread class as a thread which receives the socket and creates data streams.
 * Then, on receiving the data of program from a socket, sends the string "PONG" and prints the string "PING-PONG" with
 * the iteration number and the name of the program.
 * 4) Execute the server-program, and then a few client-programs.
 */
public class Main {
    public static void main(String[] args) {
        new MyServer().start();
    }
}

class Client {
    public static void main(String[] args) {
        new MyClient();
    }
}class Client2 {
    public static void main(String[] args) {
        new MyClient();
    }
}
