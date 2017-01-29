package com.shurda.andrey.Lab2_2;

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

        System.out.println("column a = " + a.length + " row b = " + b.length);

        for (int[] items : matrix.multiplicationMatrix(a, b)) {
            System.out.println(Arrays.toString(items));
        }

    }
}
