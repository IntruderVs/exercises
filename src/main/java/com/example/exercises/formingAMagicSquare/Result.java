package com.example.exercises.formingAMagicSquare;

import java.util.List;

class Result {

    /*
     * Complete the 'formingMagicSquare' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY s as parameter.
     * O(N^2)
     */

    public static int formingMagicSquare(List<List<Integer>> s) {
        int[][] a0 = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
        int[][] a1 = {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}};
        int[][] a2 = {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}};
        int[][] a3 = {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}};
        int[][] a4 = {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}};
        int[][] a5 = {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}};
        int[][] a6 = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
        int[][] a7 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};

        int min = Integer.MAX_VALUE;
        int[] sum = new int[8];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                sum[0] += Math.abs(s.get(i).get(j) - a0[i][j]);
                sum[1] += Math.abs(s.get(i).get(j) - a1[i][j]);
                sum[2] += Math.abs(s.get(i).get(j) - a2[i][j]);
                sum[3] += Math.abs(s.get(i).get(j) - a3[i][j]);
                sum[4] += Math.abs(s.get(i).get(j) - a4[i][j]);
                sum[5] += Math.abs(s.get(i).get(j) - a5[i][j]);
                sum[6] += Math.abs(s.get(i).get(j) - a6[i][j]);
                sum[7] += Math.abs(s.get(i).get(j) - a7[i][j]);
            }

        for (int i = 0; i < 8; i++) {
            if (sum[i] < min) {
                min = sum[i];
            }
        }

        return min;
    }

}
