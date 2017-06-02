package com.shurda.andrey.se.Lab1_9.demoproxy1;


public class CalculateImpl implements Calculate {
    @Override
    public Number multiplication(Number a, Number b) {
        return a.doubleValue() * b.doubleValue();
    }

    @Override
    public Number division(Number a, Number b) {
        return a.doubleValue() / b.doubleValue();
    }
}
