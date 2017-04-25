package com.shurda.andrey.basics.Lab2_14.testgeneric1;

public class MyTuple<A, B, C> {
    private A first;
    private B second;
    private C third;

    public MyTuple(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public C getThird() {
        return third;
    }

    @Override
    public String toString() {
        return "MyTuple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}
