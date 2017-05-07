package com.shurda.andrey.se.Lab1_4.myswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Lab1-4-1
 * 1) Create MyApplication class as a subclass of Jframe (GUI-application).
 * Define a constructor with a name parameter of type String to set the title of the application window. Also in the
 * constructor to define the size and location of the application window and make it visible.
 * 2) Create a class Main with the main() method, which creates an instance of the MyApplication class.
 * <p>
 * Lab1-4-2
 * 1) Student should in the constructor a MyApplication class add handling the window closing event with
 * use a setDefaultCloseOperation() method;
 * <p>
 * Lab1-4-3
 * Open project DemoGuiSwing (from 1.4.2 labs). Add a GUI-application following controls: JLabel – "Run a Program",
 * JComboBox - a list of standard programs (example, calc.exe, notepad.exe, etc),
 * JButton - clicking on button «Run» causes execute the selected program from the list.
 */
public class Main {
    public static void main(String[] args) {
        JFrame myFrame = new MyApplication("My first Application");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Run a Program");

        String[] list = {"calc", "notepad"};
        JComboBox<String> comboBox = new JComboBox<String>(list);

        JButton button = new JButton("Run");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runProgram((String) comboBox.getSelectedItem());

            }
        });

        panel.add(label);
        panel.add(comboBox);
        panel.add(button);

        myFrame.add(panel);
    }

    private static void runProgram(String program) {
        try {
            Process process = Runtime.getRuntime().exec(program);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
