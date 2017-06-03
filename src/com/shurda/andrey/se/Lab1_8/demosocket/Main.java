package com.shurda.andrey.se.Lab1_8.demosocket;

/**
 * Create new project called DemoSocket. Add package “com.brainacad.demosocket.
 * 1) Create a Student class with private fields: String name, String course, int id.
 * Add getters and setters to Student class. Override the toString() method.
 * 2) Create a MyClient class, which receives a Student's instance and sends it to the
 * server via a socket connection, and then receives and outputs the server's response.
 * You can implement this class as a separate thread.
 * 3) Create a MyServer class, which establishes a socket connection with the client,
 * and then outputs the received information, and sends the response to the client.
 * You can implement this class as a separate thread.
 * 4) Create a Main class with a main() method, which creates an instance of the class
 * Student and runs the threads of server and of client on execution.
 */
public class Main {
    public static void main(String[] args) {
        MyServer server = new MyServer();
        server.start();

        MyClient client = new MyClient(new Student(2, "Ivan", "JAVA"));
        client.start();
    }
}
