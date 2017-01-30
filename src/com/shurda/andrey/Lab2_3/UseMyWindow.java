package com.shurda.andrey.Lab2_3;

/**
 * Created by admin on 30.01.2017.
 */
public class UseMyWindow {
    public static void main(String[] args) {
        MyWindow myWindow1 = new MyWindow(45.5, 12.3, 6, "red", true);
        MyWindow myWindow2 = new MyWindow(4.5, 2.3, 2, "blue", true);
        MyWindow myWindow3 = new MyWindow(300, 200, 10, "yellow", false);
        MyWindow myWindow4 = new MyWindow(153.2, 20.5, 1, "black", false);
        MyWindow myWindow5 = new MyWindow(55.5, 55.5, 5, "white", true);

        myWindow1.printFields();
        myWindow2.printFields();
        myWindow3.printFields();
        myWindow4.printFields();
        myWindow5.printFields();
    }
}
