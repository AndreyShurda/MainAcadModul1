package com.shurda.andrey.Lab2_11.testexcep1;


public class MyException extends RuntimeException {
    String msg;

    public MyException(String msg) {
        this.msg = msg;
    }

    public void printMsg() {
        System.out.println("This is class " + getClass().getSimpleName() + " msg is " + msg);
    }
}
