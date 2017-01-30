package com.shurda.andrey.Lab2_2;

/**
 * Create a Matrix class that contains the methods of
 * addition and multiplication of matrices
 * (work with two-dimensional arrays);
 */

public class Matrix {

    public int[][] additionMatrix(int[][] firstMatrix, int[][] secondMatrixs) {
        int n = firstMatrix.length;
        int m = firstMatrix[0].length;
        int[][] addMatrix = new int[n][m];
        if (n == secondMatrixs.length) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    addMatrix[i][j] = firstMatrix[i][j] + secondMatrixs[i][j];
                }
            }
        } else {
            System.out.println("Number of column firstMatrix must be equals secondMatrixs");
        }
        return addMatrix;
    }

    public int[][] multiplicationMatrix(int[][] firstMatrix, int[][] secondMatrixs) {
        int n = firstMatrix.length;
        int m = secondMatrixs[0].length;
        int[][] mulMatrix = new int[n][m];

        if (n == secondMatrixs.length) {
            for (int i = 0; i < mulMatrix.length; i++) {
                for (int j = 0; j < mulMatrix[i].length; j++) {
                    for (int k = 0; k < n; k++) {
                        mulMatrix[i][j] += firstMatrix[i][k] * secondMatrixs[k][j];
                    }
                }
            }
        } else
            System.out.println("Number of column firstMatrix must be equals row of secondMatrixs");

        return mulMatrix;
    }
}
