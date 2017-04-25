package com.shurda.andrey.basics.Lab2_3;

/**
 * Create five instances of class MyWindow  with different  fields values.
 * <p>
 * Create array of MyWindow’s and fill it by creating MyWindow’s
 * objects using different constructors.
 * Call method printFields() on each array element.
 */
public class UseMyWindow {
    public static void main(String[] args) {
        System.out.println("Lab2-3-1");
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
        System.out.println();

        System.out.println("Lab2-3-2");
        MyWindow myWindow = new MyWindow();
        myWindow.printFields();
        System.out.println();

        System.out.println("Lab2-3-5");
        MyWindow[] myWindowArray = new MyWindow[4];

        myWindowArray[0] = new MyWindow();
        myWindowArray[1] = new MyWindow(25.5, 33.3);
        myWindowArray[2] = new MyWindow(123, 333, 8);
        myWindowArray[3] = new MyWindow(200, 300, 5, "brown", true);

        for (MyWindow window : myWindowArray) {
            window.printFields();
        }

    }
}
