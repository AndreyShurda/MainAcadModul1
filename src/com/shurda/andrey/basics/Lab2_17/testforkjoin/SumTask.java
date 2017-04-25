package com.shurda.andrey.basics.Lab2_17.testforkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SumTask extends RecursiveTask<Long> {
    static final int SEQUENTIAL_THRESHOLD = 20;

    private int[] array;
    private int from;
    private int to;

    public SumTask(int[] array, int from, int to) {
        this.array = array;
        this.from = from;
        this.to = to;
    }

    protected Long compute() {
        if (to - from <= SEQUENTIAL_THRESHOLD) {
            long sum = 0;
            for (int i = from; i < to; i++)
                sum += array[i];
            return sum;
        } else {
            int mid = (from + to) / 2;

            SumTask left = new SumTask(array, from, mid);
            SumTask right = new SumTask(array, mid, to);
            left.fork();

            long rightResult = right.compute();
            long leftResult = left.join();

            return leftResult + rightResult;
        }
    }

    static long sumArray(int[] array) {
//        ForkJoinPool forkJoinPool = new ForkJoinPool(10);
//        return forkJoinPool.invoke(new Sum(array, 0, array.length));
        return ForkJoinPool.commonPool().invoke(new SumTask(array, 0, array.length));
    }
}
