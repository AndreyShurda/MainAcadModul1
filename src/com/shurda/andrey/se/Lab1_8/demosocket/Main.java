package com.shurda.andrey.se.Lab1_8.demosocket;

/**
 * Lab1-8-1
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
 * <p>
 * Lab1-8-2
 * Open project called DemoSocket (from 1-8-1 lab).
 * 1) Add in the Student class override equals() method.
 * 2) Add in the MyServer class the private field users of type List<Student>, and a method for
 * initializing the list of students.
 * 3) Create a ThreadClient class as a thread that serves one client request (class contains
 * a reference to the socket connection to the server and a reference to a list of students).
 * The task - to identify and to respond if the current student of the right of access to
 * the server service.
 * 4) Rewrite the class MyServer so that it to handle each connection request has launched a
 * separate thread (class ThreadClient ).
 * 5) Rewrite the main() method so that it has launched a number of clients.
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyServer server = new MyServer();
        server.start();

        new MyClient(new Student(1, "Ivan", "C++"));
        new MyClient(new Student(2, "Andrii", "JAVA"));
        new MyClient(new Student(3, "Andrii", "JAVA"));

    }
}
