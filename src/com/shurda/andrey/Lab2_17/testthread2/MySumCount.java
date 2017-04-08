package com.shurda.andrey.Lab2_17.testthread2;

//public class MySumCount extends Thread {
public class MySumCount implements Runnable {
    private int startIndex;
    private int stopIndex;
    private int[] array;
    private long resultSum;

    @Override
    public void run() {
        for (int i = getStartIndex(); i < getStopIndex(); i++) {
            resultSum += array[i];
//            System.out.println(getName());
        }
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public long getResultSum() {
        return resultSum;
    }
}
