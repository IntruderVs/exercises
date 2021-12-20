package com.example.exercises.Fibonacci;

public class FibonacciTestData {
    static final long[] lo = new long[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765};

    protected static long[] getArray(int n) {
        if (n + 1 == lo.length)
            return lo;

        long[] lo1 = new long[n + 1];
        System.arraycopy(lo, 0, lo1, 0, n + 1);
        return lo1;
    }

    protected static long getNumberOfFibonacci(int n) {
        return lo[n];
    }
}
