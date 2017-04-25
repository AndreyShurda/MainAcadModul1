package com.shurda.andrey.basics.Lab2_2;

import java.util.Arrays;

/**
 * Created by User on 29.01.2017.
 */
public class UseMatrix {
    public static void main(String[] args) {
        int a[][] = {{1, 2},
                {3, 4}};
        int b[][] = {{1, 2, 1},
                {3, 4, 2}};

        Matrix matrix = new Matrix();

        int[][] resultArray;
        resultArray = matrix.additionMatrix(a, b);

        printArray("Addition Matrix", resultArray);

        resultArray = matrix.multiplicationMatrix(a, b);
        printArray("Multiplication Matrix", resultArray);


    }

    public static void printArray(String msg, int[][] array) {
        System.out.println(msg);
        for (int[] items : array) {
            System.out.println(Arrays.toString(items));
        }
    }
}
