package com.shurda.andrey.se.Lab1_4.mycontrols;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.UnknownHostException;

public class MyApp extends JFrame {
    public MyApp(String title) {
        super(title);
        setLocationRelativeTo(null);
        setSize(300, 170);
        setMinimumSize(new Dimension(300,170));
        createPanelWithContent(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createPanelWithContent(JFrame frame) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);
        JButton button1 = new JButton("Get_User_Name");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(System.getProperty("user.name"));
            }
        });

        JButton button2 = new JButton("Get_Comp_Name");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    textField2.setText(java.net.InetAddress.getLocalHost().getHostName());
                } catch (UnknownHostException e1) {
                    e1.printStackTrace();
                }
            }
        });

        JLabel label = new JLabel("Result");
        JTextField result = new JTextField(15);

        panel.add(textField1);
        panel.add(button1);
        panel.add(label);
        panel.add(result);
        panel.add(textField2);
        panel.add(button2);

        frame.add(panel);
        createMenu(frame, result);
    }

    private void createMenu(JFrame frame, JTextField result) {
        JMenuBar menuBar = new JMenuBar();

        JMenu menu = new JMenu("Message");
        JMenuItem item = new JMenuItem("Question");
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] options = {"Yes", "No"};
                int msg = JOptionPane.showOptionDialog(frame,
                        "You are ready to undergo the test",
                        item.getText(),
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[0]
                );
                if (msg != -1){
                    result.setText((String) options[msg]);
                }
            }
        });

        JMenuItem item2 = new JMenuItem("Input name");
        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog();

                JPanel panel = new JPanel();
                JLabel label = new JLabel("Input name");
                JTextField textField = new JTextField(10);


//                result.setText(textField.getText());
                textField.addKeyListener(new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        result.setText(textField.getText()+e.getKeyChar());
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {

                    }
                });

                panel.add(label);
                panel.add(textField);

                dialog.add(panel);
                dialog.setLocationRelativeTo(null);
                dialog.setSize(100, 100);
                dialog.setVisible(true);
            }
        });

        menu.add(item);
        menu.add(item2);

        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

//        JPanel panel = new JPanel();
//        panel.setLayout(new FlowLayout());

//        JLabel label = new JLabel("Result");
//        JTextField text = new JTextField(15);
//
//        panel.add(label);
//        panel.add(text);

//        frame.add(panel);
    }
}
