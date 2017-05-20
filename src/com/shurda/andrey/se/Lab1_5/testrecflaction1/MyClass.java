package com.shurda.andrey.se.Lab1_5.testrecflaction1;

final class MyClass {
    private int a;
    public int b;
    protected int c;
    int d;

    public MyClass() {
    }

    public MyClass(int a) {
        this.a = a;
    }

    public MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public MyClass(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}
