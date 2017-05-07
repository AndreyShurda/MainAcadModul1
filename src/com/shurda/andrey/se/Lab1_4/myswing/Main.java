package com.shurda.andrey.se.Lab1_4.myswing;

import javax.swing.*;

/**
 * 1) Create MyApplication class as a subclass of Jframe (GUI-application).
 * Define a constructor with a name parameter of type String to set the title of the application window. Also in the
 * constructor to define the size and location of the application window and make it visible.
 * 2) Create a class Main with the main() method, which creates an instance of the MyApplication class.
 */
public class Main {
    public static void main(String[] args) {
        JFrame myFrame = new MyApplication("My first Application");
    }
}
