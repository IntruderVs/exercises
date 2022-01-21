package com.example.exercises.drawingBook;

class Result {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
        if (isTheFirstOrLastPage(n, p))
            return 0;

        return Math.min(p / 2, n / 2 - p / 2);
    }

    private static boolean isTheFirstOrLastPage(int n, int p) {
        return n < 4 || (n % 2 == 1 && n - 1 == p) || n == p;
    }
}
