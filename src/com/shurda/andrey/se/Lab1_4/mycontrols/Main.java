package com.shurda.andrey.se.Lab1_4.mycontrols;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

/**
 * Lab1-4-4
 * 1) Create MyApp class as a subclass of Jframe (GUI-application). Define a constructor with a name parameter of type
 * String to set the title of the application window. Also in the constructor to define the size and location of the
 * application window and make it visible.
 * 2) Add a GUI-application following controls: Two JTextField and two JButton. One button "Cet_User_Name" to define
 * a user name and display it in the first text field. The second button "Get_Comp_Name" to define the name of the
 * computer and display it in the second text field.
 * 3) Create a class Main with the main() method, which creates an instance of the MyApplication class.
 *
 * Lab1-4-5
 * 1) Add a GUI-application following controls: In the center of the application window, place the label "Result" and
 * the text field. Add a menu bar with item "Message", which consists of the elements "Question" and "Input name".
 * When you select "Input name" opens a standard dialog box enter a user name, which displayed in the field "Result"
 * main window. When you select an element of "Question" opens a standard dialog box answer to the question "You are
 * ready to undergo the test". The result of the selection is displayed in the field "Result" main window.
 * 2) Execute the program.
 */
public class Main {
    public static void main(String[] args) {
        JFrame myApp = new MyApp("myApp");
        myApp.validate();
    }
}
